package com.wsdaoy.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.HttpKit;

import java.util.*;

public class LoLUtil {

    public static String getFreeHero() {
        String jsStr = HttpKit.get("https://lol.qq.com/act/AutoCMS/publish/LOLAct/ZMSubject_Board_Site/ZMSubject_Board_Site.js");

        String[] splitFun = jsStr.split("\\(function\\(\\)\\{return");
        String[] spObj = splitFun[1].trim().split(";}\\);");
        Map<String, Object> map = JsonUtils.getObjectByJson(spObj[0], Map.class);
        Set<String> set = map.keySet();
        int max = 0;
        for (String a : set) {
            if (Integer.parseInt(a) > max) {
                max = Integer.parseInt(a);
            }
        }
        Object obj = map.get(String.valueOf(max));
        String jsonString = JsonUtils.getJsonString(obj);
        JSONObject gameObj = JsonUtils.getObjectByJson(jsonString, JSONObject.class);

        //这里还需要做一个日期判断！
        Date now = new Date();
        JSONObject newBulle = gameObj.getJSONObject("newBulle");
        String iDate = newBulle.getString("iDate");
        iDate = iDate.replaceAll("月", "-");
        iDate = iDate.replaceAll("日", "");
        int year = DateUtils.formatYear(now);
        Date date = DateUtils.formatToDate(DateUtils.DAY, year + "-" + iDate);
        if (now.before(date)) {
            //还没打最新发布的周五，需要找上一个版本
            max -= 1;
        }
        obj = map.get(String.valueOf(max));
        jsonString = JsonUtils.getJsonString(obj);
        gameObj = JsonUtils.getObjectByJson(jsonString, JSONObject.class);

        String freeHero = gameObj.getString("freeHero");
        String[] sp = freeHero.split(",");
        Set<String> heroIds = new HashSet<>();
        for (String aSp : sp) {
            heroIds.add(aSp.trim().replaceAll("\"", ""));
        }

        StringBuilder sb = new StringBuilder();
        String json = HttpKit.get("https://game.gtimg.cn/images/lol/act/img/js/heroList/hero_list.js");
        JSONObject object = JsonUtils.getObjectByJson(json, JSONObject.class);
        JSONArray jsonArray = object.getJSONArray("hero");
        if (jsonArray.size() > 0) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject hero = jsonArray.getJSONObject(i);
                //获取玩峡谷模式的周免英雄
                if (heroIds.contains(hero.getString("heroId"))) {
                    sb.append(hero.getString("name")).append("、");
                }
            }
            sb.delete(sb.lastIndexOf("、"), sb.length());
            return sb.toString();
        }
        return null;
    }

}

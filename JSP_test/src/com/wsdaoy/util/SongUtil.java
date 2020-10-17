package com.wsdaoy.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.StrKit;

public class SongUtil {

    public static String getSong(String songName){
        String msg = null;
        //开始实现点歌功能
        if (StrKit.notBlank(songName)) {
            String search = NeteaseMusicAPI.search(songName);
            JSONObject object = JsonUtils.getJsonObjectByJsonString(search);
            assert object != null;
            if (null != object.get("result")) {
                JSONObject obj = JsonUtils.getJsonObject(object.get("result"));
                if (null != obj.get("songs")) {
                    JSONArray array = obj.getJSONArray("songs");
                    if (!array.isEmpty()) {
                        JSONObject song = JsonUtils.getJsonObject(array.get(0));//默认就取第一首歌
                        String url = "https://music.163.com/#/song?id=" + song.getString("id");
                        msg = "歌曲链接：" + url;
                    }
                } else {
                    msg = "找不到该歌曲>.<";
                }
            } else {
                msg = "找不到该歌曲>.<";
            }
        }

        return msg;
    }
}

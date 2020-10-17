package com.wsdaoy.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wsdaoy.util.JsonUtils;
import com.wsdaoy.util.NeteaseMusicAPI;

import java.util.List;
import java.util.Scanner;

public class MyCloudMusicBean {
    public static void loopSearch(boolean isLoop){
        while (true){
            System.out.println("---------------------------");
            System.out.println("====《网易云》歌单搜索====");
            System.out.println("***** 内容为空结束搜索 *****");
            System.out.println("**************************");
            System.out.println("请输入歌名：");
            Scanner sc = new Scanner(System.in);
            NeteaseMusicAPI music = new NeteaseMusicAPI();
            String temp = sc.nextLine();
            if(!isLoop || temp.trim().equals("")) break;
            String sjson = music.search(temp);
            if (null!= sjson){
                JsonUtils jsU = new JsonUtils();
                JSONObject Arrs = jsU.getJsonObjectByJsonString(sjson);
                JSONObject result = Arrs.getJSONObject("result");
                JSONArray songs = result.getJSONArray("songs");
                System.out.println("搜索的前10首歌曲：");
                for (int i = 0; i < songs.size(); i++) {
                    JSONObject tempJ = jsU.getJsonObjectByJsonString(songs.getString(i));
                    String getId = tempJ.getString("id");
                    String getUrl = "https://music.163.com/#/song?id="+getId;

                    JSONObject detailM = jsU.getJsonObjectByJsonString(music.detail(getId));

                    JSONArray detailSongs = detailM.getJSONArray("songs");
                    String str = detailSongs.getString(0);
                    JSONObject o = jsU.getJsonObjectByJsonString(str);
                    String mname = o.getString("name");
                    List<JSONObject> ar = jsU.getJsonArrayByJsonString(o.getString("ar"));
                    String aname = ar.get(0).getString("name");
                    System.out.println((i+1)+" -->《"+mname+"》 \n-"+aname+"- 歌曲链接："+getUrl);
                    System.out.println();
                }
            }

        }
    }

}

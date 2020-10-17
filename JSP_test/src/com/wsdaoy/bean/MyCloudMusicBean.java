package com.wsdaoy.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wsdaoy.util.JsonUtils;
import com.wsdaoy.util.NeteaseMusicAPI;

import java.util.*;

public class MyCloudMusicBean {
    private static String sName;
    private static HashMap<String,Object> allJsonMap = new HashMap<>();

    public static ArrayList<HashMap<String,Object>> loopSearch(boolean isLoop) {

        ArrayList<HashMap<String,Object>> allList = new ArrayList<>();  //全部列表
        JsonUtils jsU = new JsonUtils();

        System.out.println(sName);
        while (true) {
            System.out.println("---------------------------");
            System.out.println("====《网易云》歌单搜索====");
            System.out.println("请输入歌名：");

            if (sName.equals("")) {  //歌名为空值
                Scanner sc = new Scanner(System.in);
                sName = sc.nextLine();
            }

            NeteaseMusicAPI music = new NeteaseMusicAPI();
            String sjson = music.search(sName);
            int stateCode  = jsU.getJsonObjectByJsonString(sjson).getInteger("code");

            if (stateCode == 200 && null != sjson) {

                JSONObject Arrs = jsU.getJsonObjectByJsonString(sjson);
                JSONObject result = Arrs.getJSONObject("result");
                JSONArray songs = result.getJSONArray("songs");
                System.out.println("搜索的前10首歌曲：");

                for (int i = 0; i < songs.size(); i++) {

                    JSONObject tempJ = jsU.getJsonObjectByJsonString(songs.getString(i));
                    String getId = tempJ.getString("id");
                    String getUrl = "https://music.163.com/#/song?id=" + getId;

                    JSONObject detailM = jsU.getJsonObjectByJsonString(music.detail(getId));

                    JSONArray detailSongs = detailM.getJSONArray("songs");
                    String str = detailSongs.getString(0);
                    JSONObject o = jsU.getJsonObjectByJsonString(str);
                    String mname = o.getString("name");


                    List<JSONObject> ar = jsU.getJsonArrayByJsonString(o.getString("ar"));

                    JSONObject al = jsU.getJsonObjectByJsonString(o.getString("al"));

//                    System.out.println(al.getString(""));
                    String aname = ar.get(0).getString("name");
                    String picUrl = al.getString("picUrl");

                    HashMap<String, Object> saveMusicArr = new HashMap<>(); //保存一首音乐的map集合
                    saveMusicArr.put("mid",getId);
                    saveMusicArr.put("mName",mname);
                    saveMusicArr.put("aName",aname);
                    saveMusicArr.put("pUrl",picUrl);

                    allList.add(saveMusicArr);

                    System.out.println((i + 1) + " -->《" + mname + "》 \n-" + aname + "- 歌曲链接：" + getUrl);
                    System.out.println();
                }
                allJsonMap.put("songs",allList);
                allJsonMap.put("length",allList.size());
            }
            if (!isLoop) break;
        }
        System.out.println(allList);
        
    return allList;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public static HashMap<String, Object> getallJsonMap() {
        return allJsonMap;
    }

    public static void setallJsonMap(HashMap<String, Object> allJsonMap) {
        MyCloudMusicBean.allJsonMap = allJsonMap;
    }
}

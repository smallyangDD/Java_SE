package com.wsdaoy.ext;

import com.wsdaoy.bean.MyCloudMusicBean;
import com.wsdaoy.util.LoLUtil;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {

        int tz = new Random().nextInt(6)+1;
        System.out.println("当前骰子的点数是：" + tz);

        System.out.println("-------------------");

        LoLUtil lol = new LoLUtil();
        //打印获取
        System.out.println("LOL最新周免英雄：");
        System.out.println(lol.getFreeHero());
        //调用java bean类
        MyCloudMusicBean.loopSearch(true);  //true循环搜索
    }
}

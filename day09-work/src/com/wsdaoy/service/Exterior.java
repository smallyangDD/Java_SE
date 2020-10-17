package com.wsdaoy.service;

import com.wsdaoy.bean.MyCloudMusicBean;
import com.wsdaoy.util.LoLUtil;

import java.util.Random;

public interface Exterior {
    void exterior();

    default void LoL(){
        LoLUtil lol = new LoLUtil();
        //打印获取
        System.out.println("LOL最新周免英雄：");
        System.out.println(lol.getFreeHero());
    }
    default void roll(){
        int tz = new Random().nextInt(6)+1;
        System.out.println("-------------------");
        System.out.println("当前骰子的点数是：" + tz);
    }
    default void music(){
        //调用java bean类

        MyCloudMusicBean.loopSearch(false);  //true循环搜索
    }
}

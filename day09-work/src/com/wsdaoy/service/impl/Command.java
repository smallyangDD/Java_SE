package com.wsdaoy.service.impl;

import com.wsdaoy.service.Exterior;

public class Command implements Exterior {
    @Override
    public void exterior() {
        System.out.println();
        System.out.println("1.玩骰子游戏，输入指令roll");
        System.out.println("2.查看lol周限免英雄，输入指令lol");
        System.out.println("3.来首音乐--点歌，输入指令点歌");
    }


}

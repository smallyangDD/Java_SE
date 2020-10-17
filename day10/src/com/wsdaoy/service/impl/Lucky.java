package com.wsdaoy.service.impl;

import com.wsdaoy.service.OpenMode;

import java.util.ArrayList;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        //用于存储红包
        ArrayList<Integer> redPack = new ArrayList<>();
        int tempMoney = money / count;

        for (int i = 0; i < count-1; i++) {
            redPack.add(tempMoney);

            money -= tempMoney;
        }
        //剩余的金额为最后一个红包
        redPack.add(money);
        return redPack;
    }
}

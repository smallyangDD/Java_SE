package com.wsdaoy.service.impl;

import com.wsdaoy.service.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class Common implements OpenMode {
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        Random r = new Random();
        ArrayList<Integer> redPack = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int tempMoney = r.nextInt(money/count*2) +1;
            redPack.add(tempMoney);

            money -=tempMoney;
            count--;
        }

        redPack.add(money);
        return redPack;
    }
}

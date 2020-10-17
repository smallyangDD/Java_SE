package com.wsdaoy.service.impl;

import com.wsdaoy.service.LiveAble;

public class Fun implements LiveAble {


    @Override
    public void eat() {
        System.out.println("吃饭");
        LiveAble.zi();
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }


}

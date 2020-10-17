package com.wsdaoy;

import com.wsdaoy.bean.Test1;
import com.wsdaoy.service.Util;

import java.util.Date;

public class Dome2 {
    public static void main(String[] args) {
        new Util(){
            @Override
            public void getDate() {
                Date date = new Date();
                System.out.println(date.getTime());
            }
        }.getDate();
        ((Util) () -> {
            Date date = new Date();
            System.out.println(date.getTime());
        }).getDate();

        new Test1() {
            @Override
            public void show() {
                System.out.println("test1类中的show方法");
            }
        }.show();

    }
}

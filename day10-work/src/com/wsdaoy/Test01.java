package com.wsdaoy;

import com.wsdaoy.service.HandleAble;

public class Test01 {
    public static void main(String[] args) {
         HandleAble hand = new HandleAble() {
            @Override
            public void HandleString(String num) {

                System.out.println("原数字："+ num);
                int index = num.indexOf(".");
                System.out.println("取整后："+num.substring(0,index));

                double r = Double.parseDouble(num)*10000;

                System.out.println("保留4为小数四舍五入："+(double) Math.round(r)/10000);
            }
        };

         hand.HandleString("23.23456789");
    }
}

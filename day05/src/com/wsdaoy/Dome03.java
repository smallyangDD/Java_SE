package com.wsdaoy;


import com.wsdaoy.bean.Phone;

public class Dome03 {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为", 2999);
        System.out.println("手机品牌：" + p1.getBrand());
        System.out.println("价格：" + p1.getPrice());
    }
}

package com.wsdaoy;

import com.wsdaoy.bean.Cat;

public class Dome02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("TOM猫",2,"黄色");
        System.out.println("名字："+cat1.getName());
        System.out.println("毛色："+cat1.getColor());
        System.out.println("年龄："+cat1.getAge());
        Cat cat2 = new Cat("JSON");
        cat2.setColor("黑色");
        System.out.println("名字："+cat2.getName());
        System.out.println("毛色："+cat2.getColor());
        System.out.println("年龄："+cat2.getAge());
    }

}

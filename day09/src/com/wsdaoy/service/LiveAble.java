package com.wsdaoy.service;

public interface LiveAble {
    public abstract void eat();
    public abstract void sleep();

    private static void method(){
        for (int i = 0; i < 10; i++) {

            System.out.println("该吃饭了");
        }
    }

    static void zi(){
        method();
    }
}

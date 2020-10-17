package com.wsdaoy.service;

public interface B {
    void showB();
    default void show(){
        System.out.println("B接口中默认show方法");
    }

    default void method(){
        System.out.println("默认方法（不重名）");
    }

}

package com.wsdaoy.service;

public interface A {
    void showA();
    default void show(){
        System.out.println("A接口默认show方法");
    };

}

package com.wsdaoy.service;

public interface Supermarket {
    void welcome();
    void initControl();
    default void commodityShow(){
        System.out.println("     商品列表");

    }
}

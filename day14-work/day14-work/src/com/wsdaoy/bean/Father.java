package com.wsdaoy.bean;

public class Father {

    public void eat() throws ToothPainException{
        throw new ToothPainException("吃到石子");
    }

    public void drink() throws ToothPainException, TonguePainException {
        System.out.println("喝什么都行");
    }


}

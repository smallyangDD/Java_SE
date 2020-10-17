package com.wsdaoy.bean;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫努力抓老鼠");
    }
}

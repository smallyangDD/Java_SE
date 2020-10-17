package com.wsdaoy.bean;

public class Student {
    public String name;
    public int age;

    public void study() {
        System.out.println(this.name+"在学习");
    }
    public void eat() {
        System.out.println(this.name+"在吃饭");
    }
}

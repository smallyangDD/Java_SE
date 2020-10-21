package com.wsdaoy.bean;

public class Student {
    private String name;
    private int age;
    private double chengJi;

    public Student() {
    }

    public Student(String name, int age, double chengJi) {
        this.name = name;
        this.age = age;
        this.chengJi = chengJi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChengJi() {
        return chengJi;
    }

    public void setChengJi(double chengJi) {
        this.chengJi = chengJi;
    }
}

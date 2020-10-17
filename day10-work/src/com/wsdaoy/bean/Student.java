package com.wsdaoy.bean;

public class Student {
    private String name;
    private boolean chuQin;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChuQin() {
        return chuQin;
    }

    public void setChuQin(boolean chuQin) {
        this.chuQin = chuQin;
    }
}

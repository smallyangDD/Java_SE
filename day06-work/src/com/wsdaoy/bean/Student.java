package com.wsdaoy.bean;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private double height;
    public ArrayList lists = new ArrayList();
    public Student() {
    }

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
        lists.add(this.id);
        lists.add(this.name);
        lists.add(this.height);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

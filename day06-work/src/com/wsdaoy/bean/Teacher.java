package com.wsdaoy.bean;

public class Teacher {
    private String name;
    private int age;
    private String like;

    public Teacher() {
    }

    public Teacher(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void show(){
        System.out.println(name+","+age+","+like);
    }
}

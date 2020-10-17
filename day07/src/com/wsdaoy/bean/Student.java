package com.wsdaoy.bean;

public class Student {
    private String name;
    private int age;
    private int sid = 1;
    public static int temp = 1;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = temp++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(sid+","+name+","+age);
    }
}

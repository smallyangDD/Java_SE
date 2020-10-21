package com.wsdaoy.bean;


public class ItemStudent {
    public String name;
    public String id;
    public int age;
    public String phone;
    public String birthday;
    public String addr;

    public ItemStudent(String name, String id, int age, String phone, String birthday, String addr) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phone = phone;
        this.birthday = birthday;
        this.addr = addr;
    }


    @Override
    public String toString() {
        return "学生姓名：" + name +
                ", 学生id：" + id +
                ", 学生年龄：" + age +
                ", 学生电话：" + phone +
                ", 学生生日：" + birthday +
                ", 地址：" + addr;
    }
}

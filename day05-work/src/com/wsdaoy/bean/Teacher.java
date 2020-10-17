package com.wsdaoy.bean;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {

    }


    public void setName(String name) {

        this.name = name;
    }


    public void setAge(int age) {

        this.age = age;
    }


    public void setContent(String content) {

        this.content = content;
    }

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭....");
    }
    public void teach(){
        System.out.print("年龄为"+age+"的"+name);
        System.out.println("正在亢奋的讲着"+content+"的知识....");
    }
}

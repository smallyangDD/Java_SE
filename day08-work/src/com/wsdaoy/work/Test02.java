package com.wsdaoy.work;


public class Test02 {
    public static void main(String[] args) {
        Coder c = new Coder("马化腾", 35);
        c.eat();
        c.sleep();
        c.codeing();
        System.out.println("------------");
        Teacher t = new Teacher("马云", 32);
        t.eat();
        t.sleep();
        t.teaching();
    }
}

class Person {
    public static String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void eat(){
        System.out.println(name+"吃饭");
    }
    public static void sleep(){
        System.out.println(name+"睡觉");
    }
}

class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }
    public static void teaching(){
        System.out.println(name+"上课");
    }
}

class Coder extends Person{
    public Coder(String name, int age) {
        super(name, age);
    }
    public static void codeing(){
        System.out.println(name+"敲代码");
    }
}
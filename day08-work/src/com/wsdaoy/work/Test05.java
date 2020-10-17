package com.wsdaoy.work;

public class Test05 {
    public static void main(String[] args) {
        Teacher1 t = new Teacher1("王平",35,"JAVA");
        t.teaching();
        Studer s = new Studer("李大乐", 20, 90);
        s.study();
    }
}

class Person1 {
    public static String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person1.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher1 extends Person1{
    private String xueKe;

    public Teacher1() {
    }

    public Teacher1(String name, int age, String xueKe) {
        super(name, age);
        this.xueKe = xueKe;
    }


    public String getXueKe() {
        return xueKe;
    }

    public void setXueKe(String xueKe) {
        this.xueKe = xueKe;
    }

    public void teaching(){
        System.out.println(name+"老师，讲授"+xueKe+"课");
    }
}

class Studer extends Person1{
    private int fenShu;

    public Studer(String name, int age, int fenShu) {
        super(name, age);
        this.fenShu = fenShu;
    }

    public Studer() {
    }

    public int getFenShu() {
        return fenShu;
    }

    public void setFenShu(int fenShu) {
        this.fenShu = fenShu;
    }
    public void study(){
        System.out.println(name+"同学，考试得了："+fenShu+"分");
    }
}
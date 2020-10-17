package com.wsdaoy.work;

public class Test06 {
    public static void main(String[] args) {
        GongJi gj = new GongJi(2, "红色");
        gj.eat();
        gj.Daming();
        YaZi yz = new YaZi(1, "黄色");
        yz.eat();
        yz.swimming();

    }
}

class JiaQin{
    public int age;
    public String color;

    public JiaQin() {
    }

    public JiaQin(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(){

    }
}
class GongJi extends JiaQin{
    public GongJi() {
    }

    public GongJi(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat() {
        System.out.println(age+"岁的"+color+"的公鸡在啄米");
    }
    public void Daming(){
        System.out.println(age+"岁的"+color+"的公鸡在打鸣");
    }
}

class YaZi extends JiaQin{
    public YaZi() {
    }

    public YaZi(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(age+"岁的"+color+"的鸭子在吃饭");
    }
    public void swimming(){
        System.out.println(age+"岁的"+color+"的鸭子在游泳");
    }
}
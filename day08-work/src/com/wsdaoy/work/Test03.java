package com.wsdaoy.work;

public class Test03 {
    public static void main(String[] args) {
        Dog wc = new Dog("旺财", 2, 800);
        wc.eat();
        wc.lookHome();
        System.out.println("------------");
        Cat bs = new Cat("波斯猫", 3, 2000.0);
        bs.eat();
        bs.cathMouse();
    }
}

class Animal {
    public static String name;
    private static int age;
    private static double price;

    public Animal() {
    }
    public Animal(String name,int age,double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animal.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Animal.price = price;
    }

    public static void eat(){
        System.out.println(name+"在吃饭");
    }
}

class Cat extends Animal{
    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    public Cat() {
    }

    public void cathMouse() {
        System.out.println(name+"在抓老鼠");
    }
}

class Dog extends Animal{
    public Dog(String name, int age, double price) {
        super(name, age, price);
    }

    public Dog() {

    }

    public void lookHome() {
        System.out.println(name+"在看家");
    }
}

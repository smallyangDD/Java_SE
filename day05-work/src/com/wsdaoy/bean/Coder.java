package com.wsdaoy.bean;

public class Coder {
    private String name;
    private String number;
    private String money;

    public Coder() {
    }

    public Coder(String name, String number, String money) {
        this.name = name;
        this.number = number;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+number);
    }

    public void showSalary(){
        System.out.println("基本薪资为"+money+"奖金无");
    }

    public void work(){
        System.out.println("正在努力写代码中...");
    }
}

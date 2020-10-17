package com.wsdaoy.bean;

public class Book {
    private String num;
    private String name;
    private String isbn;
    private double money;
    private String date;

    public Book(String num, String name, String isbn, double money, String date) {
        this.num = num;
        this.name = name;
        this.isbn = isbn;
        this.money = money;
        this.date = date;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void showBook(){
        System.out.println(num+","+name+","+isbn+","+money+","+date);
    }
}

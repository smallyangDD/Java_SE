package com.wsdaoy;

import com.wsdaoy.bean.Book;

public class Test08 {
    public static void main(String[] args) {
        Book book1 = new Book("No0003","JAVA实战","isbn3876461348",58.8,"2017-01-01");
        Book book2 = new Book("No0004","PHP实战","isbn3876461448",38.8,"2018-01-01");
        Book book3 = new Book("No0005","C++实战","isbn3876464645",48.8,"2019-01-01");

        Book book0 = book1;
        if(book2.getMoney() > book0.getMoney()){
            book0 = book2;
        }
        if (book3.getMoney()>book0.getMoney()){
            book0 = book3;
        }
        System.out.print("最贵的一本书：");
        book0.showBook();
    }
}

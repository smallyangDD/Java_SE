package com.wsdaoy;

import com.wsdaoy.bean.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Book b = new Book();
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第"+i+"本书的名称：");
            b.setTitle(sc.nextLine());
            System.out.println("请录入第"+i+"本书的ISBN编码：");
            b.setIsbn(sc.nextLine());
            System.out.println("请录入第"+i+"本书的价格：");
            b.setPrice(sc.nextDouble());
            list.add(b);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getTitle()+","+list.get(i).getIsbn()+","+list.get(i).getPrice());
        }
    }
}

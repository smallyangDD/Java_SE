package com.wsdaoy.guanQia02;


import java.util.HashMap;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("录入学生信息，格式：姓名,年龄：");
            String str = sc.nextLine();
            String name = str.substring(0, str.indexOf("，"));
            String age = str.substring(str.indexOf("，")+1);
            map.put(name,age);
        }

        System.out.println(map);
    }
}

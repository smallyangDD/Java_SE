package com.wsdaoy;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String msg = "奥巴马";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String in = sc.next();
        String result = in.replace(msg,"***");
        System.out.println(result);
    }
}

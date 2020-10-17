package com.wsdaoy;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第一个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第一个数据：");
        int c = sc.nextInt();
        int temp = a;
        if(b>temp){
            temp = b;
        }
        if(c>temp){
            temp = c;
        }
        System.out.println("三个数中最大值："+temp);
    }
}

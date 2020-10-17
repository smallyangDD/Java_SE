package com.wsdaoy;

import java.util.Scanner;

public class Dome02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个值：");
        int i2 = sc.nextInt();
        int sum = i1+i2;
        System.out.println("输入的两个整数的和为："+sum);
    }
}

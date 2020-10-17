package com.wsdaoy;

import java.util.Scanner;

public class Dome03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个值：");
        int i2 = sc.nextInt();
        System.out.print("请输入第二个值：");
        int i3 = sc.nextInt();
        int temp = i1;

        if(i2>temp)
            temp = i2;

        if(i3>temp)
            temp = i3;

        System.out.println("三个值中最大值为："+temp);
    }
}

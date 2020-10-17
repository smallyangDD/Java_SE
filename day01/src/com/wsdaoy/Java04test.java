package com.wsdaoy;

public class Java04test {
    public static int i = 8;

    public static void main(String[] args) {
        mul(5, 2);
        add(i, 2);
        compareTow(5,70);
        compareThree(2,12,10);
    }

    private static void compareThree(int a, int b,int c) {
        int temp = a > b ? a:b;
        temp = c> temp? c:temp;
        System.out.println("三个值中最大值为："+ temp);
    }

    private static void compareTow(int a, int b) {
        int r = a > b ? a : b;
        System.out.println("最大值的：" + r);
    }

    private static void mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

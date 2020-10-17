package com.wsdaoy;

public class Test03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和位：" + sum);
    }
}

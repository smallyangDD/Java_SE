package com.wsdaoy.work1;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("总和为：" + getSum(100));
    }

    private static int getSum(int n) {
        int sum = 0;
        int a;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        a = sum;
        return a;
    }
}

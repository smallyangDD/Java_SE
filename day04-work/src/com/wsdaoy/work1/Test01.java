package com.wsdaoy.work1;

public class Test01 {
    public static void main(String[] args) {
        prinEven(20);
    }

    private static void prinEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

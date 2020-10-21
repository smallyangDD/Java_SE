package com.wsdaoy;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(F(12));
    }

    private static int F(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return F(n-1)+F(n-2);
    }
}

package com.wsdaoy;

public class Test07 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 60; i++) {
            if (j == 5) {
                System.out.println();
                j = 0;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
                j++;
            }

        }
    }
}

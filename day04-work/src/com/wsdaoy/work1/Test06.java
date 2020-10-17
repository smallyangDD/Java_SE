package com.wsdaoy.work1;

public class Test06 {
    public static void main(String[] args) {
        printX();
    }

    private static void printX() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i || j == 9 - i) {
                    System.out.print("O");

                } else {
                    System.out.print("*");

                }
            }
            System.out.println();
        }

    }
}

package com.wsdaoy;

public class PrintX {
    public static void main(String[] args) {
        zsj();
        System.out.println();
        dsj();
    }

    private static void dsj() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + (i * j)+" ");
            }
            System.out.println();
        }
    }

    private static void zsj() {
        out:for (int i = 1; i <= 9; i++) {
            inner:for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + (i * j)+" ");
            }
            System.out.println();
        }
    }
}

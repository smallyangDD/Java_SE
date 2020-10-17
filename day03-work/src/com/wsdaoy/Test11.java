package com.wsdaoy;

public class Test11 {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i+=2) {
            for (int k = 0; k <8-i;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

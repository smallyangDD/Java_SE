package com.wsdaoy;

public class Test01 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println((i & 20) == i ? "20 * "+i : "");
        }
        System.out.println("=================");
    }

}

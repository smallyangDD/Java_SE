package com.wsdaoy;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int i1 = random.nextInt(10) + 1;
            System.out.println(i1);
        }
    }
}

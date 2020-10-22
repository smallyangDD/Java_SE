package com.wsdaoy;

import javax.swing.*;

public class Test09 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int total = 10;
            int sum = 1;
            for (int i = total; i > 0 ; i--) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName()+sum);
        },"10!的值:");

        Thread t2 = new Thread(() -> {
            int total = 5;
            int sum = 1;
            for (int i = total; i > 0 ; i--) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName()+sum);
        },"5!的值:");

        Thread t3 = new Thread(() -> {
            int total = 8;
            int sum = 1;
            for (int i = total; i > 0 ; i--) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName()+sum);
        },"8!的值:");

        t1.start();
        t2.start();
        t3.start();
    }
}

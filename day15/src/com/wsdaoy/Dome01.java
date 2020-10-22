package com.wsdaoy;

public class Dome01 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 30; i++) {

                System.out.println(123);
                System.out.println(456);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(100);
                System.out.println(789);

            }
        });

        thread1.start();
        thread1.join();
        
        thread2.start();

    }
}

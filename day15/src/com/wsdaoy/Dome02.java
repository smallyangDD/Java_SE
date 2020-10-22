package com.wsdaoy;

import com.wsdaoy.Task.Task01;

public class Dome02 {
    public static void main(String[] args){
        Task01 target = new Task01();

        Thread thread1 = new Thread(target);
        Thread thread2 = new Thread(target);

        thread1.start();
        thread2.start();

    }
}

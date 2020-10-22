package com.wsdaoy.task;

public class Task01 extends Thread {
    @Override
    public void run() {
        System.out.println("线程启动："+Thread.currentThread().getName());
    }
}

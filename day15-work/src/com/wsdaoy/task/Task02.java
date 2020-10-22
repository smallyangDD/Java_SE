package com.wsdaoy.task;

public class Task02 implements Runnable{
    @Override
    public void run() {
        System.out.println("线程启动："+Thread.currentThread().getName());
    }
}

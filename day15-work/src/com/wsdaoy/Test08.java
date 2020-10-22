package com.wsdaoy;

import com.wsdaoy.task.Task05;


public class Test08 {
    public static void main(String[] args) {
        Task05 task = new Task05();

        Thread t1 = new Thread(task, "窗口a");
        Thread t2 = new Thread(task, "窗口b");
        Thread t3 = new Thread(task, "窗口c");
        Thread t4 = new Thread(task, "窗口d");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

package com.wsdaoy;

import com.wsdaoy.task.Task03;

public class Test06 {
    public static void main(String[] args) {
        Task03 task03 = new Task03();

        Thread t1 = new Thread(task03, "实体店");
        Thread t2 = new Thread(task03, "官网");

        t1.start();
        t2.start();
    }
}

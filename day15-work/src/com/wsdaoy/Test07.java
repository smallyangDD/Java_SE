package com.wsdaoy;

import com.wsdaoy.task.Task04;

public class Test07 {
    public static void main(String[] args) {
        Task04 task = new Task04();

        Thread qm = new Thread(task, "前门");
        Thread zm = new Thread(task, "中门");
        Thread hm = new Thread(task, "后门");

        qm.start();
        zm.start();
        hm.start();

    }
}

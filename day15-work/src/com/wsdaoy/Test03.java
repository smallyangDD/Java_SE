package com.wsdaoy;

import com.wsdaoy.task.Task01;
import com.wsdaoy.task.Task02;

public class Test03 {
    public static void main(String[] args) {
        Task01 t1 = new Task01();

        Thread t2 = new Thread(new Task02());

        t1.start();
        t2.start();
    }
}

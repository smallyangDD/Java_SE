package com.wsdaoy;

import com.wsdaoy.Task.Ticket;

public class Dome07 {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket,"窗口1");

        Thread t2 = new Thread(ticket,"窗口2");

        Thread t3 = new Thread(ticket,"窗口3");



        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();

    }

}

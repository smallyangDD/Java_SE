package com.wsdaoy.Task;

public class Ticket implements Runnable {
    private Integer total = 1000;
    private static Object o = new Object();

    public Integer getTotal() {
        return total;
    }


    @Override
    public void run() {
        while (true){
            synchronized (o){
                if (total <= 0){
                    System.out.println("票买完了");
                    break;
                }

                System.out.println(Thread.currentThread().getName()+"正在售卖第"+total--+"张票");

            }
        }

    }
}

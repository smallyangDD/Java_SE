package com.wsdaoy.task;

public class Task05 extends Thread{
    private Integer total = 20;
    private Object obj = new Object();


    @Override
    public void run() {
        while (true){
            if (total <=2)
                break;
            synchronized (obj){
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 卖了一张票，剩余票数为："+total--);
            }
        }
    }
}

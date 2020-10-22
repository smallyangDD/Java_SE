package com.wsdaoy.task;

public class Task03 implements Runnable {
    private Integer total = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){
            if (total <= 1){
                break;
            }
            synchronized (obj){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出售第"+(101-total--)+"个限量版的水杯");
            }
        }
    }
}

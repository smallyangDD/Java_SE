package com.wsdaoy.task;


public class Task04 implements Runnable{
    private Integer total = 80;
    private Integer sum = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){
            if (sum >= total-1){
                break;
            }
            synchronized (obj){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 第"+sum+++"个乘客上车，座位还剩："+(total-sum+1)+"个  ");
            }
        }
    }
}

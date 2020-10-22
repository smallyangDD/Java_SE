package com.wsdaoy.Task;

public class Task01 implements Runnable{

    private Integer toNum = 100;

    @Override
    public void run() {
        while (true){

            if (toNum <= 0)
                break;
                System.out.println(Thread.currentThread().getName()+"正在出售商品"+toNum--+"个");

        }
    }
}

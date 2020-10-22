package com.wsdaoy;

public class Test05 {
    public static void main(String[] args) {
        String[] name = {"张一","张二","张三","张四","张五","张六","张七","张八","张九","张十"};
        for (String s : name) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+" 通过山洞");
            },s).start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

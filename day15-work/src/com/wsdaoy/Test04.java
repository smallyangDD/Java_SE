package com.wsdaoy;

public class Test04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("播放背景音乐");
            }
        }).start();
    }
}

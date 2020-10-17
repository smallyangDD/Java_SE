package com.wsdaoy;

import com.wsdaoy.service.Swim;

public class Dome01 {
    public static void main(String[] args) {
        showSwim(new Swim() {
            @Override
            public void swin() {
                System.out.println("蛙泳");
            }
        });

        showSwim(() -> System.out.println("自由泳"));

        showSwim((Swim) () -> {
            System.out.println("蛙泳");
            System.out.println("蝶泳");
        });
    }
    private static void showSwim(Swim swim){
        swim.swin();
    }
}

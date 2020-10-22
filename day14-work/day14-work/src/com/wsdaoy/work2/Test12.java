package com.wsdaoy.work2;

import java.util.ArrayList;
import java.util.Random;

public class Test12 {
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                super.run();
                ArrayList<Integer> iList = new ArrayList<>();
                while (iList.size() < 10){
                    int i = new Random().nextInt(901) + 100;

                    iList.add(i);
                }

                int sum = 0;
                for (Integer i : iList) {
                    sum+=i;
                }
                System.out.println("随机数："+iList);
                System.out.println("10个100到1000的整数并将10个整数相加求和："+sum);
            }
        };

        th.start();

    }
}

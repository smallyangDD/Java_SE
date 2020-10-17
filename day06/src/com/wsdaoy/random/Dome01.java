package com.wsdaoy.random;

import java.util.ArrayList;
import java.util.Random;

public class Dome01 {
    private static boolean flag = true;
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> Arr = new ArrayList<>();
        while (true){
            int i = rd.nextInt(100) + 1;
            flag = true;
            Arr.forEach((e)->{
                if(e == i){
                    flag = false;
                }
            });
            if(flag){
                Arr.add(i);
            }
            if(Arr.size()==50){
                break;
            }
        }

        System.out.println(Arr.toString());
    }
}

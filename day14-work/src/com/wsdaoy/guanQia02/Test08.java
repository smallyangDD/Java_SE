package com.wsdaoy.guanQia02;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            map.put(name, new Random().nextInt(100));
        }

        Set<String> kset = map.keySet();
        int sum = 0;
        int min = 100;
        int max = 0;

        for (String s : kset) {
            sum += map.get(s);
            if (map.get(s) < min) {
                min = map.get(s);
            }
            if (map.get(s) > max) {
                max = map.get(s);
            }
        }

        System.out.println("总分=" + sum + "，最高分=" + max + "，最小值=" + min + "，平均分=" + sum / kset.size());

    }
}

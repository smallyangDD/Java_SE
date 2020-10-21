package com.wsdaoy.guanQia02;

import java.util.HashSet;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> sets = new HashSet<>();
        Integer i = null;
        int count = 0;
        while ((i = sc.nextInt()) != -1) {

            sets.add(i);
            count++;
        }
        int sum = 0;

        for (Integer integer : sets) {
            sum += integer;
        }
        System.out.println("总和："+sum);
        System.out.println("平均值："+sum/count);
    }
}

package com.wsdaoy.GuanQia1;

public class Test09 {
    private static int sum = 0;
    public static void main(String[] args) {
        sum(100);
    }

    private static void sum(int num){
        sum += num;
        if (num >= 100 && num <= 200)
            sum(++num);
        else
            System.out.println("100到200的总和："+sum);
    }
}

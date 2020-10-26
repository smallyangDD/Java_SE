package com.wsdaoy.GuanQia1;

public class Test10 {
    public static void main(String[] args) {
        int n= 10;
        int jc = jc(n);
        System.out.println(n+"的阶乘为："+jc);
    }
    private static int jc(int num){
        if (num == 1 ){
            return 1;
        }
        return num * jc(num-1);
    }
}

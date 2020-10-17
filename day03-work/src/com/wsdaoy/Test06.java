package com.wsdaoy;

public class Test06 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int i1 = i/100;
            int i2 = i/10%10;
            int i3 = i%10;

            if((i1*i1*i1)+(i2*i2*i2)+(i3*i3*i3) == i){
                System.out.println(i);
            }
        }
    }
}

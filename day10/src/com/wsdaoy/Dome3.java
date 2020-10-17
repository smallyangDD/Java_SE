package com.wsdaoy;

import com.wsdaoy.service.Calculator;

public class Dome3 {
    public static void main(String[] args) {
         Calculator calculator1 = new Calculator(){

            @Override
            public void calc(int a, int b) {
                System.out.println(a + "+" + b + "=" + (a + b));
            }

         };
        calculator1.calc(5,9);

        Calculator calculator = (a, b) -> System.out.println(a + "+" + b + "=" + (a + b));
        calculator.calc(5,3);


    }
}

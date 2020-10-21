package com.wsdaoy.guanQia01;

public class Test06 {
    public static void main(String[] args) {
        function("123");
        function(123);
    }

    private static <T> void function(T t){
        System.out.println(t);
    }
}

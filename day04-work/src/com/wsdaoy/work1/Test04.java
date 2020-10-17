package com.wsdaoy.work1;

public class Test04 {
    public static void main(String[] args) {
        char aChar = getChar(97);
        System.out.println(aChar);
    }

    private static char getChar(int a) {
        char ch;
        if((a >= 97 && a <= 122) ||
                (a >= 65 && a<= 90) ||
                (a >= 48 && a <= 57)){
            ch = (char) a;
        }else {
            ch=' ';
        }
        return ch;
    }
}

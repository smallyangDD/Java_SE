package com.wsdaoy.work1;

public class Test07 {
    public static void main(String[] args) {
        System.out.println(round(10.5));
    }

    private static int round(double v) {
        int r = 0;
        int i = (int) (v * 10 % 10);
        if (i >= 5) {
            r = (int) v + 1;
        } else {
            r = (int) v;

        }
        return r;
    }
}

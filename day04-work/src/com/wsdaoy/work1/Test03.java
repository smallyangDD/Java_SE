package com.wsdaoy.work1;

public class Test03 {
    public static void main(String[] args) {
        int zc = getPerimeter(20,30);
        int area = getArea(20,30);
        System.out.println("长方形的周长："+zc);
        System.out.println("长方形的面积："+area);
    }

    private static int getArea(int length, int width) {
        return length * width;
    }

    private static int getPerimeter(int length,int width) { ;
        return (length + width) * 2;
    }
}

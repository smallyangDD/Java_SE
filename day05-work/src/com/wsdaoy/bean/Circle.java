package com.wsdaoy.bean;

public class Circle {
    private float r;

    public Circle() {
    }

    public Circle(float r) {
        this.r = r;
    }
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public void showArea(){
        double area = r*r*3.14159;
        System.out.println("半径为："+r+"，面积为："+area);
    }
    public void showPerimeter(){
        double perimeter = r*2*3.14159;
        System.out.println("半径为："+r+"，周长为："+perimeter);
    }
}

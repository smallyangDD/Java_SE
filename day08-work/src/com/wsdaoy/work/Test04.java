package com.wsdaoy.work;


public class Test04 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
abstract class A{
    public int numa = 10;
    public abstract void showA();
}
abstract class B extends A{
    public int numb = 20;

    public abstract void showB();
}
class C extends B{
    public int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中的numa:" + numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中的numb:" + numb);
    }

    public void showC() {
        System.out.println("C类中的numc:" + numc);
    }
}
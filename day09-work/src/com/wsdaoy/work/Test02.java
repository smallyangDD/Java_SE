package com.wsdaoy.work;

public class Test02 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}
interface A{
    void showA();
}
class B implements A{
    @Override
    public void showA() {
        System.out.println("AAAA");
    }
    void showB(){
        System.out.println("BBBB");
    }
}
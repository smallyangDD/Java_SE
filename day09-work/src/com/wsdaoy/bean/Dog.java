package com.wsdaoy.bean;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("狗老老实实看家");
    }
}

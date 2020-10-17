package com.wsdaoy.bean;

public abstract class Animal {
    public String name;
    public int weight;

    public Animal() {
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void eat();
}

package com.wsdaoy.work;

import com.wsdaoy.bean.Cat;
import com.wsdaoy.bean.Dog;

public class Test05 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财",20);
        Cat cat = new Cat("汤姆",18);
        dog.eat();
        cat.eat();
        dog.lookHome();
        cat.catchMouse();
    }
}

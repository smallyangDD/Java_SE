package com.wsdaoy.bean;

public class Person {
    private String name;
    private int lifeValue;

    public Person(String name, int lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws NoLifeValueExption{
        if (lifeValue < 0){
            throw new NoLifeValueExption("生命值不能为负数："+lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}

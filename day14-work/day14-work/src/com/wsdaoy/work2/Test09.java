package com.wsdaoy.work2;

import com.wsdaoy.bean.NoLifeValueExption;
import com.wsdaoy.bean.Person;

public class Test09 {
    public static void main(String[] args) {
        Person person = new Person();
        try{
            person.setLifeValue(-10);

        }catch (NoLifeValueExption e){
            e.printStackTrace();
        }
        person.setLifeValue(1000);
        System.out.println(person.getLifeValue());
    }
}

package com.wsdaoy.guanQia02;

import com.wsdaoy.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Person p1 = new Person("强哥", 35, 172.5);
        Person p2 = new Person("阿华", 32, 175.2);
        Person p3 = new Person("大军", 35, 178.5);
        Person p4 = new Person("李四", 38, 170.5);
        Person p5 = new Person("张三", 35, 180.5);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()){
            Person person = it.next();

            person.setAge(person.getAge()+2);
        }

        for (Person person : persons) {
            System.out.println("姓名："+person.getName()+"，年龄："+person.getAge()+"，身高："+person.getHeight());
        }
    }
}

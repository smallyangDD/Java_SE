package com.wsdaoy.guanQia02;

import com.wsdaoy.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
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

        Person maxH = persons.get(0);
        Person minH = persons.get(0);

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()) {
            Person item = it.next();
            if (item.getHeight() > maxH.getHeight()) {
                maxH = item;
            }
            if (item.getHeight() < minH.getHeight()) {
                minH = item;
            }
        }
        System.out.println("最高的人是"+maxH.getName()+"，身高："+maxH.getHeight());
        System.out.println("最矮的人是"+minH.getName()+"，身高："+minH.getHeight());
    }
}

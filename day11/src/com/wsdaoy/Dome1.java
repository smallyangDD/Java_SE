package com.wsdaoy;

import com.wsdaoy.bean.Person;

import java.util.Arrays;
import java.util.Comparator;

public class Dome1 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("张三",20),
                new Person("李四",19),
                new Person("王五",17),
                new Person("老刘",25),
                new Person("老张",25),
        };

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}

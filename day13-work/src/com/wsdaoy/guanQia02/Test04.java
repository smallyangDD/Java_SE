package com.wsdaoy.guanQia02;

import com.wsdaoy.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        HashSet<Student> sets = new HashSet<>();

        sets.add(new Student("张一",20,"男"));
        sets.add(new Student("张二",25,"男"));
        sets.add(new Student("张三",18,"男"));
        sets.add(new Student("张一",20,"男"));
        sets.add(new Student("张五",21,"男"));
        sets.add(new Student("张六",20,"男"));
        sets.add(new Student("张七",22,"男"));
        sets.add(new Student("张八",20,"男"));
        sets.add(new Student("张九",22,"男"));
        sets.add(new Student("张十",20,"男"));

        Iterator<Student> it = sets.iterator();
        while (it.hasNext()){
            Student item = it.next();
            System.out.println("姓名："+item.getName()+"，年龄："+item.getAge()+"，性别："+item.getSex());
        }
        System.out.println("================");
        for (Student student : sets) {
            System.out.println("姓名："+student.getName()+"，年龄："+student.getAge()+"，性别："+student.getSex());
        }
    }
}

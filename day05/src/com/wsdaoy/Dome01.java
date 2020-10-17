package com.wsdaoy;

import com.wsdaoy.bean.Student;

public class Dome01 {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name = "张三";
        stu.study();
        stu.eat();
    }
}

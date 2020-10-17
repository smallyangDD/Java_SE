package com.wsdaoy;

import com.wsdaoy.bean.Student;

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 15);
        System.out.println(s1.getName() + " " + s1.getAge());
    }

}

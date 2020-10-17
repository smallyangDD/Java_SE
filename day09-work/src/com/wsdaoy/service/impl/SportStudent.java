package com.wsdaoy.service.impl;

import com.wsdaoy.bean.Student;
import com.wsdaoy.service.Sport;

public class SportStudent extends Student implements Sport {
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" +getAge()+"岁 "+getName()+" 的学生在打篮球");
    }
}

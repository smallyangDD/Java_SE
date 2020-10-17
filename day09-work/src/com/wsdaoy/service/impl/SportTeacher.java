package com.wsdaoy.service.impl;

import com.wsdaoy.bean.Teacher;
import com.wsdaoy.service.Sport;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" +getAge()+"岁 "+getName()+" 的老师在打篮球");

    }
}

package com.wsdaoy;

import com.wsdaoy.bean.Student;
import com.wsdaoy.bean.Teacher;

public class Test03 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("李老师");
        t.setAge(30);
        t.setContent("JAVA面对对象");
        t.eat();
        t.teach();
        Student stu = new Student("黄同学",22, "JAVA面对对象");
        stu.eat();
        stu.study();
    }
}

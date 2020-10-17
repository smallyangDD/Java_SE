package com.wsdaoy;

import com.wsdaoy.bean.Student;

public class Dome1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("小小", 18);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }

}

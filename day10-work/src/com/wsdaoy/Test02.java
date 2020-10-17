package com.wsdaoy;

import com.wsdaoy.bean.Course;
import com.wsdaoy.bean.Student;
import com.wsdaoy.bean.Teacher;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> allStu = new ArrayList<>();
        Student stu1 = new Student("小红");
        Student stu2 = new Student("小亮");
        Student stu3 = new Student("小明");

        allStu.add(stu1);
        allStu.add(stu2);
        allStu.add(stu3);

        Teacher t1 = new Teacher("张老师");
        t1.selectPerson(stu1);
        t1.selectPerson(stu2);


        Course javaC = new Course("Java", t1, allStu);
        javaC.show();
    }

}

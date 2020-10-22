package com.wsdaoy.work1.guanQia01;

import com.wsdaoy.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test07 {
    public static void main(String[] args) {
        HashMap< Student,String> stuMap = new HashMap<>();

        stuMap.put(new Student("张三",20),"广东肇庆");
        stuMap.put(new Student("张四",21),"广东广州");
        stuMap.put(new Student("张五",20),"海南海口");
        stuMap.put(new Student("张六",21),"广东湛江");
        stuMap.put(new Student("张三",20),"广东阳江");

        Set<Student> kset = stuMap.keySet();
        for (Student student : kset) {
            System.out.println(student+" 住址："+stuMap.get(student));
        }
        System.out.println();
        Set<Map.Entry<Student, String>> entries = stuMap.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }
    }
}

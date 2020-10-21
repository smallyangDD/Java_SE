package com.wsdaoy.guanQia02;

import com.wsdaoy.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("小花",19,89.0);
        Student stu2 = new Student("小李",18,90.0);
        Student stu3 = new Student("小强",20,76.0);
        Student stu4 = new Student("小红",18,95.0);
        Student stu5 = new Student("小明",23,95.5);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        Iterator<Student> it = students.iterator();
        double sum = 0.0;
        double max = students.get(0).getChengJi();
        double min = students.get(0).getChengJi();

        while (it.hasNext()){
            double fs = it.next().getChengJi();
            sum += fs;
            if(fs > max){
                max = fs;
            }
            if (fs < min){
                min = fs;
            }
        }
        System.out.println("总分："+sum);
        System.out.println("平均分："+sum/students.size());
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
    }
}

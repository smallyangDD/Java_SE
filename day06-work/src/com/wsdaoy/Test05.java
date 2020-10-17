package com.wsdaoy;

import com.wsdaoy.bean.Student;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();
        Student stu1 = new Student("it001", "黄渤", 1.72);
        Student stu2 = new Student("it002", "孙红雷", 1.78);
        Student stu3 = new Student("it003", "章子怡", 1.64);
        Student stu4 = new Student("it004", "杨颖", 1.68);
        studs.add(stu1);
        studs.add(stu2);
        studs.add(stu3);
        studs.add(stu4);
        System.out.println("集合元素有"+studs.size()+"个");
        for (int i = 0; i < studs.size(); i++) {
            forArr(studs, i);

        }
        System.out.println("----------------");
        for (int i = 0; i < studs.size(); i++) {
            if(studs.get(i).getHeight() > 1.70){
                forArr(studs, i);
            }
        }
    }

    private static void forArr(ArrayList<Student> studs, int i) {
        for (int j = 0; j < studs.get(i).lists.size(); j++) {
            System.out.print(studs.get(i).lists.get(j)+",");
        }
        System.out.println();
    }
}

package com.wsdaoy;

import com.wsdaoy.bean.Teacher;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher t1 = new Teacher("姚小明", 23, "打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦", 45, "踢足球");

        list.add(t1);
        list.add(t2);
        list.add(t3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
        System.out.println("------------");
        for (int i = 0; i < list.size(); i++) {
            Teacher item = list.get(i);
            if (item.getAge() > 40){
                item.setLike("打高尔夫");
                item.show();
            }
        }
    }
}

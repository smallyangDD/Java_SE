package com.wsdaoy.guanQia01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        map.put("4","赵六");

        Set<String> strings = map.keySet();

        Iterator<String> sit = strings.iterator();
        System.out.println("增强for：");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("迭代器：");
        while (sit.hasNext()){
            System.out.println(sit.next());
        }

    }
}

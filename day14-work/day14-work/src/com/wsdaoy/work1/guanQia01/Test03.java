package com.wsdaoy.work1.guanQia01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("张三",22);
        map.put("李四",20);
        map.put("王五",21);
        map.put("赵六",19);

        Collection<Object> values = map.values();
        System.out.println("增强for：");
        for (Object value : values) {
            System.out.println(value);
        }

        Iterator<Object> iit = values.iterator();
        System.out.println("迭代器：");
        while (iit.hasNext()){
            System.out.println(iit.next());
        }
    }
}

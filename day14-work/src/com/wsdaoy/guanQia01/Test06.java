package com.wsdaoy.guanQia01;


import java.util.*;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("广东肇庆","张三");
        map.put("广东广州","张四");
        map.put("海南海口","张五");
        map.put("广东湛江","张六");
        map.put("广东阳江","张七");

        Set<String> keys = map.keySet();

        Iterator<String> kit = keys.iterator();
        while (kit.hasNext()){
            String ikey = kit.next();

            System.out.println(ikey+" 住址的学生："+map.get(ikey));
        }

        Set<Map.Entry<String, String>> eset = map.entrySet();

        Iterator<Map.Entry<String, String>> eit = eset.iterator();

        while (eit.hasNext()) {
            System.out.println(eit.next());
        }

    }
}

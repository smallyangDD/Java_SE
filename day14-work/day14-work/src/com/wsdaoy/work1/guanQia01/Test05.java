package com.wsdaoy.work1.guanQia01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","刘岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        Iterator<Map.Entry<String, String>> eit = entries.iterator();

        while (eit.hasNext()){
            Map.Entry<String, String> item = eit.next();

            System.out.println(item);
        }

    }
}

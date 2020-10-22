package com.wsdaoy.work1.guanQia01;


import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();

        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");

        map.put("key2","修改的key2");

        System.out.println("key3的值："+map.get("key3"));

        map.remove("key5");

        System.out.println(map);
    }
}

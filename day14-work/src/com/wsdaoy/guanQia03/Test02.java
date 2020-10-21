package com.wsdaoy.guanQia03;

import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");

        map.put("入云龙","公孙胜");
        map.put("豹子头","林冲");

        map.remove("玉麒麟");
        map.remove("智多星",null);
        map.put("呼保义","宋江");

        System.out.println(map);
    }
}

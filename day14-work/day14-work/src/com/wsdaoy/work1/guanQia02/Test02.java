package com.wsdaoy.work1.guanQia02;

import java.util.HashMap;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);

        Integer money = map.get("柳岩");
        System.out.println("柳岩的工资"+money);
        
        map.put("柳岩",money+300);

        Set<String> kset = map.keySet();
        for (String s : kset) {
            System.out.println(s+"的工资："+map.get(s));
        }
    }
}

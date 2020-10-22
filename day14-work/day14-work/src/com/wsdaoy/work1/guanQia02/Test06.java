package com.wsdaoy.work1.guanQia02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Test06 {
    public static  void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        list.add("abc");
        list.add("bcd");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            char[] chars = it.next().toCharArray();
            int count= 0;
            for (char c : chars) {
                String s = Character.toString(c);
                if (null != map.get(s)){
                    count = map.get(s)+1;
                }else {
                    count = 1;
                }
                map.put(s,count);
            }
        }

        System.out.println(map);

    }
}

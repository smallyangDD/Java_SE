package com.wsdaoy.guanQia02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test07 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String str = "If you wantto change your fate I think you must come to the dark horse to learnjava";
        String[] sArr = str.split(" ");
        int count = 0;
        for (String s : sArr) {
            if(null != map.get(s)){
                count = map.get(s)+1;
            }else {
                count = 1;
            }

            map.put(s,count);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}

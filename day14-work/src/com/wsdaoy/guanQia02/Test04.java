package com.wsdaoy.guanQia02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int count = 0;
        for (char c : chars) {
            String s = Character.toString(c);
            if (null != map.get(s)){
                count = map.get(s)+1;
            }else {
                count = 1;
            }
            map.put(s,count);
        }
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.print(s+"("+map.get(s)+") ");
        }

    }
}

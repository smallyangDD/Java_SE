package com.wsdaoy.work1.guanQia02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要统计的字符串：");
        countingKey(map,sc.nextLine());

        System.out.println("输入需要统计的目标：");
        String getStr = sc.nextLine();
        System.out.println("\""+getStr+"\"出现的次数："+map.get(getStr));
    }

    private static void countingKey(HashMap<String, Integer> map, String key){
        char[] chars = key.toCharArray();
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
    }
}

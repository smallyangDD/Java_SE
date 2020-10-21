package com.wsdaoy.guanQia03;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        while (set.size() < 4) {
            String[] id = new String[8];

            for (int i = 0; i < 8; i++) {
                id[i] = new Random().nextInt(10) + "";
            }
            String str = "";
            for (String s : id) {
                str += s;
            }
            set.add(str);
        }

        Iterator<String> it = set.iterator();
        map.put("苹果", it.next());
        map.put("香蕉", it.next());
        map.put("西瓜", it.next());
        map.put("橘子", it.next());

        System.out.println(map);

        Set<String> kset = map.keySet();
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();

        for (String s : kset) {

            if (map.get(s).equals(ss)) {
                System.out.println("根据商品号：" + ss + "，查询到对应的商品为：" + s);
            }
        }
    }
}

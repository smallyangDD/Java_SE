package com.wsdaoy.guanQia02;

import java.util.*;

public class Test09 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("Java",32.5);
        map.put("C++",25.0);
        map.put("PHP",28.6);
        map.put("UI",21.3);
        map.put("Python",10.2);

        Set<String> strings = map.keySet();

        HashSet<String> books = new HashSet<>();

        while (books.size() < 5){
            System.out.println("请输入书名和价格，格式：书名,价格");
            books.add(sc.nextLine());
        }

        Iterator<String> it = books.iterator();

        while (it.hasNext()){
            String str = it.next();
            String name = null;
            Double price = null;
            if (str.contains(",")){
                name = str.substring(0,str.indexOf(","));
                price = Double.parseDouble(str.substring(str.indexOf(",")+1));
            }
            else if(str.contains("，")){
                name = str.substring(0,str.indexOf("，"));
                price = Double.parseDouble(str.substring(str.indexOf("，")+1));

            }
            map.put(name,price);
        }

        map.put("Java",38.5);

        Set<String> kset = map.keySet();
        for (String s : kset) {
            System.out.println(s+","+map.get(s));
        }

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry);
        }
    }
}

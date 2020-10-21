package com.wsdaoy.guanQia01;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("xiaomi1");
        list.add("xiaomi2");
        list.add("xiaomi3");
        list.add("xiaomi4");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

package com.wsdaoy.guanQia02;

import java.util.ArrayList;
import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        lists.add("a");
        lists.add("f");
        lists.add("b");
        lists.add("c");
        lists.add("a");
        lists.add("s");

        set.addAll(lists);

        lists.clear();

        lists.addAll(set);

        System.out.println("去重后的集合"+lists);
    }
}

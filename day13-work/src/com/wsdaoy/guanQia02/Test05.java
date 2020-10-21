package com.wsdaoy.guanQia02;

import java.util.ArrayList;
import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        HashSet<String> sets = new HashSet<>();

        String[] arr = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};

        for (String str : arr) {
            sets.add(str);
        }

        lists.addAll(sets);

        for (String str : lists) {
            System.out.println(str);
        }
    }
}

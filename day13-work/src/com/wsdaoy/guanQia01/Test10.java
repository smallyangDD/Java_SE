package com.wsdaoy.guanQia01;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        for (String s : add("a", "b", "c", "d", "e")) {
            System.out.println(s);
        }

    }

    private static ArrayList<String> add(String... str){
        ArrayList<String> strings = new ArrayList<>();
        for (String s : str) {
            strings.add(s);
        }
        return strings;
    }
}

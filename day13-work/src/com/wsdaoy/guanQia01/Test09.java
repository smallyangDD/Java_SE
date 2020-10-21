package com.wsdaoy.guanQia01;

import java.util.ArrayList;
import java.util.Collections;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();

        lists.add(33);
        lists.add(11);
        lists.add(77);
        lists.add(55);

        Collections.sort(lists);

        System.out.println("排序："+lists);

        Collections.shuffle(lists);

        System.out.println("乱序："+lists);

        Collections.reverse(lists);

        for (Integer i : lists) {
            System.out.println(i);
        }
    }
}

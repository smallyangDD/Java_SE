package com.wsdaoy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        ArrayList<Object> objects = new ArrayList<>();

        list.add(222);
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(555);

        list.pop();
        list.remove(2);

        System.out.println(list);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(0) instanceof Number);

    }
}

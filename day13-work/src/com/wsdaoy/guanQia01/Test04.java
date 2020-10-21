package com.wsdaoy.guanQia01;

import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();

        list.add(11);
        list.add(22);
        list.add(33);
        list.addFirst(55);
        list.addLast(66);
        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list);
        list.removeFirst();
        System.out.println("移除第一个："+list);
        list.removeLast();
        System.out.println("移除最后一个："+list);

    }
}

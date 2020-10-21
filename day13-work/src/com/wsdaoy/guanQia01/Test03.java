package com.wsdaoy.guanQia01;

import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(2,55);

        list.set(1,66);
        System.out.println(list.get(3));

        System.out.println(list.size());

        System.out.println("未移除的数组："+list);
        list.remove(0);
        System.out.println("移除元素后："+list);
        list.clear();
        System.out.println("清空元素数组："+list);
    }
}

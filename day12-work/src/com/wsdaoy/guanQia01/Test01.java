package com.wsdaoy.guanQia01;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("添加后的集合："+ list);
        list.remove(0);
        System.out.println("移除第一个元素："+list);
        System.out.println("集合大小："+list);
        list.clear();
        System.out.println("清空集合后："+list);
    }
}

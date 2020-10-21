package com.wsdaoy.guanQia01;

import java.util.HashSet;

public class Test06 {
    public static void main(String[] args) {
        HashSet<Integer> hmap = new HashSet<>();
        HashSet<Integer> hmap2 = new HashSet<>();
        hmap.add(11);
        hmap.add(22);
        hmap.add(33);
        hmap.add(44);
        hmap.add(55);
        hmap.add(55);

        hmap2.add(11);
        hmap2.add(22);
        hmap2.add(33);
        hmap2.add(44);

        System.out.println("HashMap的hash值："+hmap.hashCode());
        System.out.println("两个HashSet是否一致:"+hmap.equals(hmap2));

        //Set的add方法根据对象的哈希值来确定元素在集合中的存储位置，相同的元素计算的哈希值一致，进行覆盖。
        System.out.println(hmap);
    }
}

package com.wsdaoy.guanQia02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<String> lists = new LinkedList<>();
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        for (String str : strs) {
            if(!lists.contains(str)){

                lists.add(str);
            }
        }

        System.out.println("迭代器打印：");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("增强for打印：");
        for (String str : lists) {
            System.out.println(str);
        }
    }
}

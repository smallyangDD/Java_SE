package com.wsdaoy.guanQia01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");


        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}

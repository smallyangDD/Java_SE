package com.wsdaoy.guanQia02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();
        while (sets.size() < 10){
            Integer i = new Random().nextInt(20) + 1;
            sets.add(i);
        }

        Iterator<Integer> it = sets.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

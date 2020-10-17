package com.wsdaoy;

import java.util.Arrays;
import java.util.Comparator;

public class Dome2 {
    public static void main(String[] args) {
        Integer[] arr = {1,12,4,5,6,47,8};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

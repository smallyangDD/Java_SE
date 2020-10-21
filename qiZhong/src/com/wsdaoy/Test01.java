package com.wsdaoy;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f'};
        char[] newArr = new char[6];
        for (int i = 0,j = arr.length-1; i < arr.length; i++,j--) {
            newArr[i] = arr[j];
        }
        System.out.println("原数组："+ Arrays.toString(arr));
        System.out.println("翻转后的数组："+ Arrays.toString(newArr));
    }
}

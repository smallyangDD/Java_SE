package com.wsdaoy.guanQia02;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        String[] strArr = {"aa","bb","cc","dd"};
        Integer[] intArr = {1,2,3,4,5,6};
        swap(strArr,0,3);
        swap(intArr,1,3);
    }

    private static <T> void swap(T[] arr,int a,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

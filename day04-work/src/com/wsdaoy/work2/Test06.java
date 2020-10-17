package com.wsdaoy.work2;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0,j=arr.length-1; i < arr.length / 2; i++,j--) {
            if(arr[i] != arr[j]){
                flag = false;
            }
        }
        System.out.println(Arrays.toString(arr)+"是否为对称数组："+flag);
    }
}

package com.wsdaoy.work2;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("数组中最小的数："+min);
    }
}

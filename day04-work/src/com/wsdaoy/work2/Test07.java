package com.wsdaoy.work2;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 1};
        equals(arr1, arr2);
    }

    private static void equals(int[] arr1, int[] arr2) {
        boolean flag = true;
        if (arr1.length != arr1.length) {  //先判定长度
            flag = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("是否一致：" + flag);

    }
}

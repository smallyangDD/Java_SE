package com.wsdaoy.work2;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] newArr = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i]*2;
        }
        System.out.println("老数组为：");
        System.out.println(Arrays.toString(nums));
        System.out.println("新数组为：");
        System.out.println(Arrays.toString(newArr));
    }
}

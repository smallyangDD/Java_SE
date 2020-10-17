package com.wsdaoy.work2;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {99, 100, 98, 97, 96};
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getCount(arr);
        int end = (sum - max - min) / (arr.length-2);
        System.out.println("最终得分是：" + end);

    }

    private static int getCount(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

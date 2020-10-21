package com.wsdaoy.guanQia02;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("c");
        arr.add("a");
        arr.add("b");
        arr.add("b");
        arr.add("b");
        arr.add("a");

        String testStr = "b";
        System.out.println(testStr+"出现的次数："+frequency(arr,testStr));
    }

    private static int frequency(ArrayList<String> arr, String key){
        int count = 0;
        for (String o : arr) {
            if(key == o){
                count ++;
            }
        }
        return count;
    }
}

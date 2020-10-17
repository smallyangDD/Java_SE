package com.wsdaoy.work2;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        String[] puckArr = new String[54];
        String[] huase = {"♦", "♣", "♥", "♠"};
        String[] arr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        createPuck(puckArr, huase, arr);   //创建所有牌
        System.out.println(Arrays.toString(puckArr));
    }

    private static void createPuck(String[] puckArr, String[] huase, String[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j < huase.length;j++) {
                puckArr[n] = arr[i] + huase[j];
                n++;
            }
        }
        puckArr[puckArr.length-2] = "小🃏";
        puckArr[puckArr.length-1] = "大🃏";
    }
}

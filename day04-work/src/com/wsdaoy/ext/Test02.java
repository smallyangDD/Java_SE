package com.wsdaoy.ext;

import java.util.Arrays;

public class Test02 {
    //    发牌
    public static void main(String[] args) {
        String[] puckArr = new String[54];
        String[] huase = {"♦", "♣", "♥", "♠"};
        String[] arr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        createPuck(puckArr, huase, arr);   //创建所有牌
        String[] p1 = new String[17];
        String[] p2 = new String[17];
        String[] p3 = new String[17];
        int temp1 = 0;int temp2 = 0;int temp3 = 0;
        int index = 0;
        for (int i = 0; i < puckArr.length; i++) {
            if(i== 5 || i ==15 || i==14){
                continue;
            }
            if(index%3==0){
                p1[temp1] = puckArr[i];
                temp1++;
            }else if(index%3==1){
                p2[temp2] = puckArr[i];
                temp2++;
            }else if(index%3==2){
                p3[temp3] = puckArr[i];
                temp3++;
            }
            index++;
        }
        System.out.println("玩家1："+ Arrays.toString(p1));
        System.out.println("玩家2："+Arrays.toString(p2));
        System.out.println("玩家3："+Arrays.toString(p3));
        System.out.println("地主牌：["+puckArr[5]+","+puckArr[15]+","+puckArr[14]+"]");

//        System.out.println(Arrays.toString(puckArr));
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

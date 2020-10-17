package com.wsdaoy;

public class FbnqShulie {
    public static void main(String[] args) {
        int i = 1; //小
        int j = 1; //大
        int sum = 0;  //总和

        for (int k = 1; k <= 12; k++) {
            if(k == 1 || k == 2){
                sum = 1;
            }else {
                sum = i + j;
                i = j;
                j = sum;
            }
        }
        System.out.println(sum);
    }
}

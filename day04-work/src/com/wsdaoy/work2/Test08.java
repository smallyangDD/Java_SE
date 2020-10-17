package com.wsdaoy.work2;

public class Test08 {
    public static void main(String[] args) {
        char[] daArr = {'A','D','B','C','D'};
        pingfen(daArr);
    }

    private static void pingfen(char[] daArr) {
        char[] s1 = {'D','C','B','A','D'};
        char[] s2 = {'A','D','B','C','D'};
        char[] s3 = {'A','D','B','C','A'};
        char[] s4 = {'A','B','C','D','D'};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < daArr.length; i++) {
            sum1 = daArr[i] == s1[i] ? sum1+1 : sum1;
            sum2 = daArr[i] == s2[i] ? sum2+1 : sum2;
            sum3 = daArr[i] == s3[i] ? sum3+1 : sum3;
            sum4 = daArr[i] == s4[i] ? sum4+1 : sum4;
        }
        System.out.println("满分10分，小明得分："+sum1*2);
        System.out.println("满分10分，小红得分："+sum2*2);
        System.out.println("满分10分，小黄得分："+sum3*2);
        System.out.println("满分10分，小强得分："+sum4*2);
    }
}

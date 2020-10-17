package com.wsdaoy.work2;

public class Test05 {
    public static void main(String[] args) {
        int[] cjList = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int count = 0;
        int avg = getAvg(cjList);
        for (int i = 0; i < cjList.length; i++) {
            if(cjList[i] > avg){
                count++;
            }
        }
        System.out.println("高于平均分："+avg+" 的人数为 "+count+"个");
    }

    private static int getAvg(int[] cjList) {
        int sum = 0;
        for (int i = 0; i < cjList.length; i++) {
            sum += cjList[i];
        }
        return sum/cjList.length;
    }
}

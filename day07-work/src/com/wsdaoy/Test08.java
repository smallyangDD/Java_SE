package com.wsdaoy;

public class Test08 {
    private static int count = 0;

    public static void main(String[] args) {
        String str = "javajfiewjavajfiowfjavagkljjava";
        String ch = "java";
        getCount(str,ch);
        System.out.println(str+"字符串中的"+ch+"数量："+count);
    }
    public static void getCount(String str, String ch){
        int i = 0;
        while (true){
            int index = str.indexOf(ch,i);
            if(index != -1){
                count++;
                i = index + ch.length();
            }else {
                break;
            }
        }

    }
}

package com.wsdaoy;


public class Test04 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        System.out.println("str字符串转换为小写："+str.toLowerCase());
        System.out.println("str字符串转换为大写："+str.toUpperCase());
        System.out.println("str字符串转换为小写："+str.replace("o","6"));
        System.out.println("str字符串转换为小写："+str.replace("ll","LL"));
    }
}

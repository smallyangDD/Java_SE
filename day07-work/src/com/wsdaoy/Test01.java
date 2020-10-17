package com.wsdaoy;

public class Test01 {
    public static void main(String[] args) {
        String str1 = "你好";
        String str2 = new String("hello");
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        String str3 = new String(arr);
        System.out.println("方式一创建字符串：" + str1);
        System.out.println("方式二创建字符串：" + str2);
        System.out.println("方式三创建字符串：" + str3);
    }
}

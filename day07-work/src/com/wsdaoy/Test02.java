package com.wsdaoy;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";
        System.out.println("str1和str2内容是否相等："+str1.equals(str2));
        System.out.println("str1和str3内容是否相等："+str1.equals(str3));
        System.out.println("忽略大小写比较str1和str3内容是否相等："+str1.equalsIgnoreCase(str3));
        System.out.println("str1字符串是否以He前缀开头："+(str1.indexOf("He") == 0));
        System.out.println("str1字符串是否以abc前缀开头："+(str1.indexOf("abc") == 0));
        System.out.println("str1字符串是否以o后缀结尾："+(str1.lastIndexOf("o")==str1.length()-1));
        System.out.println("str1字符串是否以l后缀结尾："+(str1.lastIndexOf("l")==str1.length()-1));
    }
}

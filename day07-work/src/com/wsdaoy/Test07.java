package com.wsdaoy;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        checkQQ(sc.nextLine());

    }
    public static void checkQQ(String qq){
        boolean flag = true;
        if(qq.length() >= 5 && qq.length() <=12){
            for (int i = 0; i < qq.length(); i++) {
                if((int)qq.toCharArray()[i] < '0' | (int)qq.toCharArray()[i] >'9')
                    flag = false;
            }
            if(qq.indexOf("0") == 0)
                flag = false;
        }
        else {
            flag = false;
        }
        System.out.println("这个QQ号码是否正确："+ flag);
    }
}

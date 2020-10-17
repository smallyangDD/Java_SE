package com.wsdaoy.ext;

import java.util.Random;
import java.util.Scanner;

public class GuessSize {
    public static void main(String[] args) {
        Random rd = new Random();
        int i1 = rd.nextInt(6)+1;
        int i2 = rd.nextInt(6)+1;
        int i3 = rd.nextInt(6)+1;
        while (true){
            System.out.println("请确定猜大小：(B代表大，S代表小)：");
            Scanner sc = new Scanner(System.in);
            String in = sc.nextLine();
            int temp = i1 + i2 + i3;
            if((in.equals("B") | in.equals("b")) && temp<=18 && temp>=10){
                System.out.println("你猜大，对了！！！");
                System.out.println("点数为："+temp);
                break;
            }else if((in.equals("S") | in.equals("s")) && temp<10 && temp>=0) {
                System.out.println("你猜小，对了！！！");
                System.out.println("点数为："+temp);
                break;
            }else if(in.equals("B") | in.equals("b")){
                System.out.println("你猜大，错了！！！");
                System.out.println("点数为："+temp);
                break;
            }else if(in.equals("S") | in.equals("s")){
                System.out.println("你猜小，错了！！！");
                System.out.println("点数为："+temp);
                break;
            }else {
                System.out.println("你输入的字符有误！");
            }
        }

    }
}

package com.wsdaoy;

import com.wsdaoy.service.impl.Shopping;

import java.util.Scanner;

public class Test08 {
    static{
        System.out.println("     欢迎使用超市购物系统");
    }
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        Scanner sc = new Scanner(System.in);
        int a = 123;

        while (true) {
            shopping.initControl();
            String str = sc.nextLine();

            if (str.startsWith("1")) {
                shopping.commodityShow();

                String buyCom = sc.nextLine();
                while (!"end".startsWith(buyCom)) {
                    //判断输入字符格式
                    if (buyCom.indexOf("-") != -1 && buyCom.indexOf("-") == buyCom.lastIndexOf("-")) {

                        shopping.addBuyCar(buyCom);

                    } else {
                        System.out.println("你输入的购买姿势不对，请换个姿势再来一次（格式：商品id-购买数量）");
                    }
                    buyCom = sc.nextLine();
                }

            } else if (str.startsWith("2")) {
                shopping.showAllBuyInfo();
            } else if (str.startsWith("3")) {
                System.out.println("感谢使用超市系统，欢迎下次使用，拜拜");
                break;
            } else {
                System.out.println("操作指令输入有误！请重新输入");
            }
        }

    }
}

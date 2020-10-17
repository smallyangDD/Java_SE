package com.wsdaoy;

import com.wsdaoy.service.impl.Shopping;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.welcome();
        shopping.initControl();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (true){
            if(str.startsWith("1")){

                break;
            }else if(str.startsWith("2")){

                break;
            }else if(str.startsWith("3")){

                break;
            }else {
                System.out.println("操作指令输入有误！请重新输入");
            }
        }

    }
}

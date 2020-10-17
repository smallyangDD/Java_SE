package com.wsdaoy.ext;

import java.util.Scanner;

public class GuessNumber {
    static int min = 1;
    static int max = 100;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一个玩家设置中奖值：");
        int rd = sc.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");  //手动清屏
        System.out.print("现在范围在：" + min + "-" + max + " --> ");
        while (true) {
            int i = sc.nextInt();
            if (i <= max && i >= min) {
                if (i > rd) {
                    System.out.println("** 大了！！！    **");

                    max = i;
                    count++;
                } else if (i < rd) {
                    System.out.println("** 小了！！！    **");
                    min = i;
                    count++;
                } else if (i == rd) {
                    System.out.println("\n^O^ ^O^ ^O^ ^O^ ^O^ ^O^ ^O^");
                    System.out.println(" ————————————————————");
                    System.out.println("| 恭喜你猜对了数字：" + rd+" |");
                    System.out.println("| 猜错统计次数：" + count+"      |");
                    System.out.println(" ————————————————————");
                    System.out.println("^O^ ^O^ ^O^ ^O^ ^O^ ^O^ ^O^");
                    break;
                }
            } else {
                System.out.println("输入的数字超出范围了！\n\n\n\n");
            }

            System.out.print("现在范围在：" + min + "-" + max + "-->");
        }
    }
}

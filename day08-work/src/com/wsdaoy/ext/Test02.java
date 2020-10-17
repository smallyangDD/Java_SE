package com.wsdaoy.ext;

import com.wsdaoy.util.SongUtil;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        SongUtil su = new SongUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入歌名：");
        String input = sc.nextLine();
        System.out.println(input+"  "+su.getSong(input));
    }
}

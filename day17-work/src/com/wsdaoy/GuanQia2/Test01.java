package com.wsdaoy.GuanQia2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("使用分割符：\\");
        String str = sc.nextLine();

        File file = new File(str);
        if (file.exists()) {
            long l = file.length();
            System.out.println("文件或文件夹已存在！大小："+l);
        }else{
            if (file.isFile()) {
                File file1 = new File(str);
                try {
                    file1.createNewFile();
                    System.out.println(file1.getName()+"文件创建成功");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(file1.getName()+"文件创建失败！");
                }
            }
            if (file.isDirectory()) {
                File file1 = new File(str);
                file1.mkdir();
                System.out.println(file1.getName()+"文件夹创建成功！");
            }
        }
    }
}

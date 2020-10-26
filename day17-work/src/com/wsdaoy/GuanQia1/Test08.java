package com.wsdaoy.GuanQia1;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("D:\\aaa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
            count++;
        }
        System.out.println("文件夹或文件共："+count);
    }
}

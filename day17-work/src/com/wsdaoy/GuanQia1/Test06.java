package com.wsdaoy.GuanQia1;

import java.io.File;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        File f = new File("C:");
        boolean bb = true;
        for (File file : f.listFiles()) {
            if (file.getName().equals("aaa")){
                System.out.println(file.getName()+"文件夹已存在");
                bb = false;
            }
        }
        if (bb){
            File f1 = new File("C:\\aaa");
            System.out.println("创建aaa文件夹");
            f1.mkdir();
        }
        File file = new File("C:\\aaa\\b.txt");
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件创建失败或文件已存在！！");
        }
    }
}

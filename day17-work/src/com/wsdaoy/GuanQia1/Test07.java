package com.wsdaoy.GuanQia1;

import java.io.File;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        File f2 = new File("D:\\aaa");

        f1.createNewFile();
        f2.mkdir();

        if (f1.isFile())
            System.out.println(f1.getName()+"是文件");
        else
            System.out.println(f1.getName()+"是文件夹");

        if (f2.isFile())
            System.out.println(f2.getName()+"是文件");
        else
            System.out.println(f2.getName()+"是文件夹");
    }
}

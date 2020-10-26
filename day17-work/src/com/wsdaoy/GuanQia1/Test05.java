package com.wsdaoy.GuanQia1;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File file = new File("D:","a.txt");
        file.delete();
        File f = new File("C:", "aaa");

        System.out.println(f.delete());
    }
}

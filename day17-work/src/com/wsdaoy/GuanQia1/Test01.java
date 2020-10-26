package com.wsdaoy.GuanQia1;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        File f1 = new File("D://bbb");
        File f2 = new File("","aaa");

        f1.mkdir();
        f2.mkdir();
    }
}

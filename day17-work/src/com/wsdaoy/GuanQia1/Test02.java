package com.wsdaoy.GuanQia1;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        boolean flag = true;
        File f = new File("D:");
        for (File file : f.listFiles()) {
            if (file.isFile() && file.getName()=="a.txt") {
                System.out.println(file.getName()+"已存在！");
                flag = false;
            }
        }
        if (flag){
            File file = new File("D:", "a.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

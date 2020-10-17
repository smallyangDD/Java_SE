package com.wsdaoy;

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList<>();
        lis.add("bca");
        lis.add("bcasaf");
        lis.add("bcfasa");
        lis.add("你们好吗");
        lis.add("我来了");
        lis.add("别跑呀");
        lis.add("fds");
        System.out.println("原来的ArrayList："+lis.toString());
        for (int i = 0; i < lis.size(); i++) {
            if(lis.get(i).length() > 4){
                lis.remove(i);
                i--;
            }
        }
        System.out.println("删除后的ArrayList："+lis.toString());
    }
}

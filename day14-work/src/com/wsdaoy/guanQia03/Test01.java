package com.wsdaoy.guanQia03;

import java.util.HashMap;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> allMap = new HashMap<>();

        HashMap<String, String> iMap1 = new HashMap<>();
        iMap1.put("001","李晨");
        iMap1.put("002","范冰冰");

        HashMap<String, String> iMap2 = new HashMap<>();
        iMap2.put("001","马云");
        iMap2.put("002","马化腾");

        allMap.put("java基础班",iMap1);
        allMap.put("java就业班",iMap2);

        Set<String> Aset = allMap.keySet();
        for (String s : Aset) {
            HashMap<String, String> imap = allMap.get(s);
            System.out.println(s+":");
            Set<String> imset = imap.keySet();
            for (String s1 : imset) {
                System.out.println("\t"+s1+" "+imap.get(s1));
            }
        }
    }
}

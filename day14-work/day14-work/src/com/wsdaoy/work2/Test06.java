package com.wsdaoy.work2;


import java.rmi.server.ExportException;

public class Test06 {
    public static void main(String[] args) {
        try {
            testThrows();
        } catch (Exception e) {
            e.printStackTrace();
        }

        testTryCatch();
    }

    public static char charAt(String str, int index) throws Exception{
        if (null == str)
            throw new Exception("字符串不能为空");
        else if ("".equals(str))
            throw new Exception("字符串不能为空");
        else if (index > str.length()-1 || index < 0)
            throw new Exception("索引越界");
        else {
            return str.toCharArray()[index];
        }
    }

     public static void testThrows() throws Exception{
        charAt("bbbbbb",-1);
    }

    public static void testTryCatch(){
        try {
            System.out.println(charAt("",0));
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            System.out.println(charAt(null,0));
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            System.out.println(charAt("daff",2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

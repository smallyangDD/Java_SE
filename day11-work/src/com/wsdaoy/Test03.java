package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);
    }
}

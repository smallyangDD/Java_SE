package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws Exception{
        String dateStr = "1996-10-15";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date brithday = df.parse(dateStr);
        System.out.println(brithday);
    }
}

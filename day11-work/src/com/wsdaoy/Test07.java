package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test07 {
    public static void main(String[] args) throws Exception{
        String dateStr = "2016-12-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        sdf.applyPattern("yyyy年MM月dd日");
        String format = sdf.format(date);
        System.out.println(format);
    }
}

package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
    public static void main(String[] args) throws Exception{
        String dateStr = "1996-10-15";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        long time1 = date.getTime();

        Date date1 = new Date();
        long time2 = date1.getTime();

        long brithday = time2 - time1;

        System.out.println("离出生已有："+(brithday / 1000 / 60 / 60 / 24) +"天");

    }
}

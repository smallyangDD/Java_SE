package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dome4 {
    public static void main(String[] args) throws Exception {

        String dateStr = "1996-9-23";
        String tempStr = dateStr.substring(0,4);
        System.out.println(tempStr);
        String endStr = dateStr.replaceAll(tempStr,Integer.parseInt(tempStr)+100+"");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        Date date2 = sdf.parse(endStr);
        long time1 = date.getTime();
        long endTime = date2.getTime();

        Date date1 = new Date();
        long time2 = date1.getTime();

        long brithday = time2 - time1;

        long did = time1 + endTime - time2;

        System.out.println("已存活："+brithday / 1000 / 60 / 60 / 24);


        System.out.println("100年预计可存活："+(did/1000/60/60/24)+"小时");
    }
}

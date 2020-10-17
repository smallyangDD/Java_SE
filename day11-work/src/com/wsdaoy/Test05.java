package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) throws Exception{

        Calendar calendar = Calendar.getInstance();

        calendar.add(calendar.DAY_OF_YEAR,500);

        Date time = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy年MM月dd日");
        String format = sdf.format(time);

        System.out.println(format);

    }
}

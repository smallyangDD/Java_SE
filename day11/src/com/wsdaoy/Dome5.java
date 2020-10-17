package com.wsdaoy;

import java.util.Calendar;
import java.util.Date;

public class Dome5 {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        int i1 = calendar.get(calendar.YEAR);
        int i2 = calendar.get(calendar.MONTH) + 1;
        int i3 = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(date);

    }
}

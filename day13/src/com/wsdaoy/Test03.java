package com.wsdaoy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        Date time = instance.getTime();
        instance.set(1996,9,23);

        System.out.println(instance.getWeekYear());
    }
}

package com.wsdaoy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dome3 {
    public static void main(String[] args) throws Exception{
        String dateTest = "2020/10/16 14:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(dateTest);

        //换模式
        sdf.applyPattern("yyyy年MM月dd日 HH时mm分ss秒");

        String format = sdf.format(date);
        System.out.println(format);
    }
}

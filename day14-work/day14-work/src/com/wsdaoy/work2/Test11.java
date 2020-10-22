package com.wsdaoy.work2;

import com.wsdaoy.bean.DebitCard;

public class Test11 {
    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        try {
            dc.setMoney(-10);
            dc.setMoney(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dc.getMoney());
    }
}

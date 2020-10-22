package com.wsdaoy.work2;

import com.wsdaoy.bean.Son;
import com.wsdaoy.bean.TonguePainException;

public class Test08 {
    public static void main(String[] args) {
        Son son = new Son();
        try {
            son.drink();
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}

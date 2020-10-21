package com.wsdaoy.service.impl;

import com.wsdaoy.service.Inter;

public class Imple01 implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

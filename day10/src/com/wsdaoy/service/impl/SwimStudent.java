package com.wsdaoy.service.impl;

import com.wsdaoy.service.Swimable;

public class SwimStudent implements Swimable {

    @Override
    public void swiming() {
        System.out.println("会游泳的学生...");
    }
}
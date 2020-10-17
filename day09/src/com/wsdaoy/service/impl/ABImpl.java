package com.wsdaoy.service.impl;

import com.wsdaoy.service.A;
import com.wsdaoy.service.B;

public class ABImpl implements A, B {
    @Override
    public void showA() {
        System.out.println("重写接口A的抽象方法");
    }

    @Override
    public void showB() {
        System.out.println("重写接口B的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("实现类重写接口方法");
    }
}

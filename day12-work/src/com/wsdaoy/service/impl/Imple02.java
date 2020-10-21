package com.wsdaoy.service.impl;

import com.wsdaoy.service.Inter;

public class Imple02 <E> implements Inter<E> {

    @Override
    public void show(E e) {
        System.out.println(e);
    }
}

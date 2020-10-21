package com.wsdaoy.guanQia01;

import com.wsdaoy.service.impl.Imple01;
import com.wsdaoy.service.impl.Imple02;

public class Test07 {
    public static void main(String[] args) {
        Imple01 imple01 = new Imple01();
        Imple02<Integer> imple02 = new Imple02<>();
        imple01.show("Imple01的打印");
        imple02.show(123456);
    }
}

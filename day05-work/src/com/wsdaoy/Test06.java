package com.wsdaoy;

import com.wsdaoy.bean.Coder;
import com.wsdaoy.bean.Manager;

public class Test06 {
    public static void main(String[] args) {
        Manager m = new Manager("James",9527,15000,3000);
        Coder c = new Coder("Kobe","0025","10000");
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("===============");
        c.intro();
        c.showSalary();
        c.work();
    }
}

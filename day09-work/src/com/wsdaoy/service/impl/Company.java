package com.wsdaoy.service.impl;

import com.wsdaoy.bean.Employee;
import com.wsdaoy.service.Money;

public class Company implements Money {
    public static double allMoney = 1000000.0;

    @Override
    public void paySalary(Employee emp) {
        allMoney -= emp.getSalary();
        System.out.println("给" + emp.getName() + "发工资 " + emp.getSalary() + " 元，公司总资金还剩：" + allMoney + "元");
    }
}

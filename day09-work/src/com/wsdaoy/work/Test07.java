package com.wsdaoy.work;

import com.wsdaoy.bean.Coder;
import com.wsdaoy.bean.Manager;
import com.wsdaoy.service.impl.Company;

public class Test07 {
    public static void main(String[] args) {
        Company company = new Company();
        Manager manager = new Manager("张强",9000.0);
        Coder coder = new Coder("李晓亮",5000.0);

        company.paySalary(manager);
        company.paySalary(coder);
    }
}

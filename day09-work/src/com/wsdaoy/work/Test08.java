package com.wsdaoy.work;

import com.wsdaoy.bean.Fruit;
import com.wsdaoy.bean.GouWuChe;
import com.wsdaoy.bean.Laptop;
import com.wsdaoy.bean.Phone;

public class Test08 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("g10000", "笔记本", 10000.0);
        Phone phone = new Phone("g10001","手机",5000.0);
        Fruit fruit = new Fruit("g20000", "苹果", 50);
        GouWuChe gouWuChe = new GouWuChe();
        System.out.println("===========添加商品==========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);

        gouWuChe.showGoods();

        gouWuChe.total();
    }
}

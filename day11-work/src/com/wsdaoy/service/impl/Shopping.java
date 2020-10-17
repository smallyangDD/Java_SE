package com.wsdaoy.service.impl;

import com.wsdaoy.service.Supermarket;

public class Shopping implements Supermarket {

    @Override
    public void welcome() {
        System.out.println("     欢迎使用超市购物系统");
    }

    @Override
    public void initControl() {
        System.out.println("请输入你要的进行的操作：");
        System.out.println("1:购物商品        2:结算并打印小票   3：退出系统");
    }

}

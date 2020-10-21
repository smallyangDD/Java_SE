package com.wsdaoy;

import com.wsdaoy.exception.RegisterException;

public class Dome01 {
    public static void main(String[] args) {
        String name = "admin";

        System.out.println("注册用户：");
        try {
            register(name);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    private static void register(String name) throws RegisterException{
        if("admin".equals(name)){
            throw new RegisterException("用户已存在！！");
        }

    }
}

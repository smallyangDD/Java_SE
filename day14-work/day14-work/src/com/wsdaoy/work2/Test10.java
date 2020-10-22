package com.wsdaoy.work2;

import com.wsdaoy.bean.LoginException;

public class Test10 {
    public static void main(String[] args) {
//        login("admin","admin");
        try {
//            login("admin","admin");
            login("admin","123456");
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }

    public static void login(String name,String pwd) throws LoginException {
        String ckName = "admin";
        String ckPwd = "123456";

        if (!ckName.equals(name)){
            throw new LoginException("用户名不存在");
        }else {
            if (ckPwd.equals(pwd)){
                System.out.println("欢迎用户"+name);
            }else {
                throw new LoginException("用户名或密码不正确");
            }
        }

    }
}

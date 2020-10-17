package com.wsdaoy;

import com.wsdaoy.bean.Receptionist;
import com.wsdaoy.bean.User;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> weiFenZu = new ArrayList<>();
        ArrayList<User> userList = new ArrayList<>();

        Receptionist r1 = new Receptionist();
        Receptionist r2 = new Receptionist();
        Receptionist r3 = new Receptionist();

        for (int i = 1; i < 50; i++) {
            User user = new User(i);
            userList.add(user);
        }
        for (int i = 0; i < userList.size(); i++) {
            User iUser = userList.get(i);

            if (iUser.getId()>=10 && iUser.getId()<=19){
                r1.receptionUser(iUser,"v1");
            }else if(iUser.getId()>=20 && iUser.getId()<=29){
                r2.receptionUser(iUser,"v2");
            }else if(iUser.getId()>=30 && iUser.getId()<=50){
                r3.receptionUser(iUser,"A");
            }else {
                weiFenZu.add(iUser.getId() +"-"+ iUser.getType());
            }
        }

        System.out.println("未分组：");
        System.out.println(weiFenZu);
        System.out.println();
        int count = 0;
        for (int i = 0; i < userList.size()/10; i++) {
            for (int j = 0; j < userList.size()/(userList.size()/10); j++) {
                User iUser = userList.get(count);
                System.out.print(iUser.getId()+"-"+iUser.getType()+" ");
                count++;
            }
            System.out.println();
        }

    }

}

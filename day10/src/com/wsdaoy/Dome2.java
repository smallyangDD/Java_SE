package com.wsdaoy;

import com.wsdaoy.bean.RedPack;
import com.wsdaoy.service.impl.Common;
import com.wsdaoy.service.impl.Lucky;

import java.util.ArrayList;

public class Dome2 {
    public static void main(String[] args) {
        RedPack redPack = new RedPack();
        redPack.setName("群主大大");
        
        redPack.setOpenMode(new Lucky());

        ArrayList<Integer> luckRedPack = redPack.getOpenMode().faHongBao(50, 9);

        System.out.println(redPack.getName()+"发了个随机红包"+luckRedPack);
        
        redPack.setOpenMode(new Common());

        ArrayList<Integer> commonRedPack = redPack.getOpenMode().faHongBao(10, 5);

        System.out.println(redPack.getName()+"发了一个普通红包："+commonRedPack);
    }
}

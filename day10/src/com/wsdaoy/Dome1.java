package com.wsdaoy;

import com.wsdaoy.bean.Armour;
import com.wsdaoy.bean.Role;
import com.wsdaoy.bean.Weapon;

public class Dome1 {

    public static void main(String[] args) {
        Role zs = new Role();
        zs.setId(0);
        zs.setBlood(100);
        zs.setName("战士");
        Armour ar = new Armour();
        Weapon wp = new Weapon();
        wp.setName("机关枪");
        wp.setHurt(500);
        ar.setName("魔甲");
        ar.setProtect(200);
        zs.setArmour(ar);
        zs.setWeapon(wp);

        zs.attack();
        zs.wear();
    }
}

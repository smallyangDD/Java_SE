package com.wsdaoy.bean;

public class Role {
    private Integer id;
    private Integer blood;
    private String name;

    private Weapon weapon;
    private Armour armour;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(name+"使用"+weapon.getName()+"武器，造成"+weapon.getHurt()+"点伤害");
    }
    public void wear(){
        System.out.println(name+"穿上了"+armour.getName()+"增加了"+armour.getProtect()+"点防御值");
    }
}

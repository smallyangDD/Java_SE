package com.wsdaoy.bean;

public class Card {
    private String huase;
    private String dianshu;

    public Card(String huase, String dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }
    public void showCard(){
        System.out.println(huase+dianshu);
    }
}

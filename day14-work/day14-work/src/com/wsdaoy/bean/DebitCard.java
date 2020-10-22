package com.wsdaoy.bean;

public class DebitCard {
    private String accountNumber;

    public DebitCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    private double money;


    public DebitCard() {
    }

    public void setMoney(double money) throws Exception {
        if (money < 0){
            throw new Exception("金额不能为负数："+money);
        }
        this.money = money;

    }

    public double getMoney() {
        return money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

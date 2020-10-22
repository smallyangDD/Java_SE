package com.wsdaoy.bean;

public class NoLifeValueExption extends RuntimeException{
    public NoLifeValueExption() {
    }

    public NoLifeValueExption(String message) {
        super(message);
    }
}

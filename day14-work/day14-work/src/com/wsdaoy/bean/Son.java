package com.wsdaoy.bean;

public class Son extends Father{

//    @Override
//    public void eat() throws TonguePainException {
//        super.eat();
//    }

//    @Override
//    public void eat() throws PainExecption {
//        super.eat();
//    }

//    @Override
//    public void eat() throws ToothPainException {
//        super.eat();
//    }


//    @Override
//    public void eat() throws BigToothPainException {

//    }


//    @Override
//    public void eat() throws FrontToothPainExcption {
//
//    }


    @Override
    public void eat() throws ToothPainException {
        super.eat();
    }

    @Override
    public void drink() throws TonguePainException {
        System.out.println("喝到100度的水");
        throw new TonguePainException("舌头疼");
    }

}

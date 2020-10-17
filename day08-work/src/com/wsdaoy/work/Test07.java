package com.wsdaoy.work;

public class Test07 {
    public static void main(String[] args) {
        JingLi jl = new JingLi("m110", "老王", 10000.0);
        jl.eat();
        jl.working();
        ChuShi cs = new ChuShi("c100","小王",6000.0);
        cs.eat();
        cs.working();
    }
}

abstract class worker{
    public String pid;
    public String pname;
    public double money;

    public worker() {
    }

    public worker(String pid, String pname, double money) {
        this.pid = pid;
        this.pname = pname;
        this.money = money;
    }

    public abstract void eat();

    public abstract void working();
}


class JingLi extends worker{
    public JingLi() {
    }

    public JingLi(String pid, String pname, double money) {
        super(pid, pname, money);
    }

    @Override
    public void eat() {
        System.out.println("工号为："+pid+"，姓名为："+pname+"，工资为："+money+"的经理在吃鱼");
    }

    @Override
    public void working() {
        System.out.println("工号为："+pid+"，姓名为："+pname+"，工资为："+money+"的经理在工作，管理其他人");
    }
}

class ChuShi extends worker{
    public ChuShi() {
    }

    public ChuShi(String pid, String pname, double money) {
        super(pid, pname, money);
    }

    @Override
    public void eat() {
        System.out.println("工号为："+pid+"，姓名为："+pname+"，工资为："+money+"的厨师在吃鱼");
    }

    @Override
    public void working() {
        System.out.println("工号为："+pid+"，姓名为："+pname+"，工资为："+money+"的厨师在工作，炒菜");
    }
}
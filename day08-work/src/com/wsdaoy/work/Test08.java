package com.wsdaoy.work;

public class Test08 {
    public static void main(String[] args) {
        Lecturer hx = new Lecturer("666", "傅红雪");
        hx.work();
        Tutor gq = new Tutor("668","顾琪");
        gq.work();
        Maintainer pd = new Maintainer("686","庖丁");
        pd.work();
        Buyer jt = new Buyer("888","景甜");
        jt.work();
    }
}

abstract class Employee{
    public String id;
    public String name;
    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void work();
}

abstract class Teacher2 extends Employee{
    public Teacher2() {
    }

    public Teacher2(String id, String name) {
        super(id, name);
    }

}

abstract class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

}

class Lecturer extends Teacher2{

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+id+" 的讲师 "+name+" 在讲课");
    }
}

class Tutor extends Teacher2{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+id+" 的助教 "+name+" 在帮助学生解决问题");
    }
}

class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+id+" 的维护专员 "+name+" 在解决不能共享屏幕的问题");
    }
}

class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+id+" 的采购专员 "+name+" 在采购音响设备");
    }
}

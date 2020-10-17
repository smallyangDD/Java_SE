package com.wsdaoy;

import com.wsdaoy.service.impl.SwimStudent;
import com.wsdaoy.service.impl.SwimTeacher;

public class Dome02 {
    public static void main(String[] args) {
        SwimTeacher st = new SwimTeacher();
        SwimStudent ss = new SwimStudent();
        Sport sport = new Sport();
        st.swiming();
        ss.swiming();
        sport.swiming();
    }
    //内部类继承父类，并进行方法的重写
    private static class Sport extends SwimStudent{
        public Sport() {
        }

        @Override
        public void swiming() {
            System.out.println("喜爱游泳运动的学生....");
        }
    }
}




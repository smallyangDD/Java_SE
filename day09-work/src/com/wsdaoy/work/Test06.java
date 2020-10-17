package com.wsdaoy.work;

import com.wsdaoy.service.impl.SportStudent;
import com.wsdaoy.service.impl.SportTeacher;

public class Test06 {
    public static void main(String[] args) {
        SportStudent student = new SportStudent("大姚",30);
        SportTeacher teacher = new SportTeacher("王中王",40);
        student.playBasketball();
        teacher.playBasketball();
    }
}

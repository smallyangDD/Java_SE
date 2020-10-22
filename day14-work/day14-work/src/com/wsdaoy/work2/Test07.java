package com.wsdaoy.work2;

import com.wsdaoy.bean.NoScoreException;
import com.wsdaoy.bean.Student;

public class Test07 {
    public static void main(String[] args) {
        Student stu = new Student();
        try{

            stu.setScore(-5);
        }catch (NoScoreException e){
            e.printStackTrace();
        }
        stu.setScore(60);

        System.out.println(stu.getScore());
    }

}

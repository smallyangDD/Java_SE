package com.wsdaoy.bean;

import java.util.ArrayList;

public class Course {
    private String keCheng;
    private Teacher teacher;
    private ArrayList<Student> stuList = new ArrayList<>();

    public Course(String keCheng, Teacher teacher, ArrayList<Student> stuList) {
        this.keCheng = keCheng;
        this.teacher = teacher;
        this.stuList = stuList;
    }

    public Course() {
    }

    public String getKeCheng() {
        return keCheng;
    }

    public void setKeCheng(String keCheng) {
        this.keCheng = keCheng;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }


    public void show(){
        System.out.println("课程名称："+keCheng);
        System.out.println("授课老师："+teacher.getName());
        for (int i = 0; i < stuList.size(); i++) {
            Student tempStu = stuList.get(i);
            if(tempStu.isChuQin()){
                System.out.println("上课："+tempStu.getName());

            }else{
                System.out.println("旷课："+tempStu.getName());
            }
        }
    }
}

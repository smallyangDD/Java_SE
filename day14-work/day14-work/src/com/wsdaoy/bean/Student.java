package com.wsdaoy.bean;

import java.rmi.server.ExportException;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int score,String name) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws NoScoreException{
        if (score < 0) {
            throw new NoScoreException("分数不能为负数:"+score);
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名："+name+" 年龄："+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

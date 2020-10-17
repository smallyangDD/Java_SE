package com.wsdaoy;

public class Test01 {
    public static void main(String[] args) {
        int score = 100;
        if (score >= 90) {
            System.out.println(score + "分，成绩优秀");
        } else if (score >= 80) {
            System.out.println(score + "分，成绩良好");
        } else if (score >= 70) {
            System.out.println(score + "分，成绩中等");
        } else if (score >= 60) {
            System.out.println(score + "分，成绩及格");
        } else {
            System.out.println(score + "分，成绩不及格");
        }
    }
}

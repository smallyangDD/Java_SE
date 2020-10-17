package com.wsdaoy;

public class ChengjiPinji {
    public static void main(String[] args) {
        pj(60);
    }

    private static void pj(int cj) {
        if (cj >= 90) {
            System.out.println(cj + "分，成绩优秀");
        } else if (cj >= 80) {
            System.out.println(cj + "分，成绩良好");
        } else if (cj >= 70) {
            System.out.println(cj + "分，成绩中等");
        } else if (cj >= 60) {
            System.out.println(cj + "分，成绩及格");
        } else {
            System.out.println(cj + "分，成绩不及格");
        }
    }
}

package com.wsdaoy.work1;

public class Test05 {
    public static void main(String[] args) {
        showColor("red");
    }

    private static void showColor(String color) {
        switch (color){
            case "red":
                System.out.println(color + "是红色！");
                break;
            case "blue":
                System.out.println(color + "是蓝色！");
                break;
            case "green":
                System.out.println(color + "是绿色！");
                break;
            default:
                System.out.println("未知颜色！");
                break;
        }
    }
}

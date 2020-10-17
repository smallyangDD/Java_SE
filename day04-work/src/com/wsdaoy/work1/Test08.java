package com.wsdaoy.work1;

public class Test08 {
    public static void main(String[] args) {
        float du1 = 60.2F;
        float du2 = 52.5F;
        System.out.println("摄氏度为："+du1+"°C ---华氏度为："+changeWd(du1)+"F");
        System.out.println("华氏度为："+du2+"F ---摄氏度为："+changeFs(du2)+"°C");
    }

    private static float  changeFs(float du) {
        return (float) ((du-32)*5/9.0);
    }

    private static float changeWd(float du) {
        return (float) ((9.0/5)*du + 32);
    }
}

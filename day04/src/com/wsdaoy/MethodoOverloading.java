package com.wsdaoy;

public class MethodoOverloading {
//    方法重载
    public static void main(String[] args) {

        System.out.println(compare(1,1));
        System.out.println(compare(1.0,1.0));
        System.out.println(compare((float) 1.0,(float) 1.0));
        System.out.println(compare((long)15555,(long)1));
    }

    private static boolean compare(int i, int j) {
            System.out.print("两个值是否相等：");
        return (i==j);
    }
    private static boolean compare(float i, float j) {
        System.out.print("两个值是否相等：");
        return (i==j);
    }
    private static boolean compare(double i, double j) {
        System.out.print("两个值是否相等：");
        return (i==j);
    }
    private static boolean compare(long i, long j) {
        System.out.print("两个值是否相等：");
        return (i==j);
    }

}

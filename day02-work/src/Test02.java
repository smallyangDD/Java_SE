public class Test02 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println("byte类型b1+b2的和为：");
        System.out.println(b3);
        System.out.println("short类型s1+s2的和为：");
        System.out.println(s3);
    }
}

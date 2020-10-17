public class Test08 {
    public static void main(String[] args) {
        char ch = 'J';
        System.out.println((char) (ch + 32));
        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);
        double d3 = 0.5D;
        int i3 = 123;
        double sum3 = d3 + i3;
        System.out.println("sum3的值为：" + sum3);
        System.out.println("sum3的整数部分：" + (int) sum3);
        double d4 = 0.2216D;
        int i4 = 12465;
        int mul4 = (int) (d4 * i4);
        System.out.println("mul4的整数部分：" + mul4);
    }
}

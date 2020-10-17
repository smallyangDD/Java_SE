public class Test04 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        int b1 = 12;
        int b2 = 13;
        System.out.println(a1 + "是偶数？" + (a1 % 2 == 0 ? true : false));
        System.out.println(a2 + "是偶数？" + (a2 % 2 == 0 ? true : false));
        System.out.println(b1 + "是奇数？" + (b1 % 2 == 0 ? false : true));
        System.out.println(b2 + "是奇数？" + (b2 % 2 == 0 ? false : true));
    }
}

public class Test07 {
    public static void main(String[] args) {
        add(100, 200);
        sub(100,200);
        mul(100,200);
        div(100,200);
        remain(100,200);
    }

    private static void remain(int a, int b) {
        System.out.println("x,y的取余为：" + (a % b));
    }

    private static void div(int a, int b) {
        System.out.println("x,y的商为：" + (a / b));
    }

    private static void mul(int a, int b) {
        System.out.println("x,y的积为：" + (a * b));
    }

    private static void sub(int a, int b) {
        System.out.println("x,y的差为：" + (a = b));
    }

    private static void add(int a, int b) {
        System.out.println("x,y的和为：" + (a + b));
    }

}

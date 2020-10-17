public class Test06 {
    public static void main(String[] args) {
        printString();
    }

    private static void printString() {
        int num = 4560;
        String str = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println("num：" + num + "是" + str);
    }
}

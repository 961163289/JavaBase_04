package 本章作业;

public class Homework03 {
    public static void main(String[] args) {
        int n = 153;
        int num1 = n / 100;
        int num2 = n % 100 / 10;
        int num3 = n % 10;
        if (n == num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3) {
            System.out.println(n + "为水仙花数");
        } else {
            System.out.println(n + "不是水仙花数");
        }
    }
}

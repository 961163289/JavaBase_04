package 本章作业_9;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " 大于0");
        } else if (num < 0) {
            System.out.println(num + " 小于0");
        } else if (num == 0) {
            System.out.println(num + " 等于0");
        }
    }
}

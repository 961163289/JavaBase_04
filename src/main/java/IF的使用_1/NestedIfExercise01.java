package IF的使用_1;

import java.util.Scanner;

public class NestedIfExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份: ");
        int mth = scanner.nextInt();
        if (mth >= 1 && mth <= 12) {
            System.out.println("请输入年龄:");
            int age = scanner.nextInt();
            if (mth >= 4 && mth <= 10) {
                if (age > 0 && age < 130) {
                    if (age >= 18 && age <= 60) {
                        System.out.println("价格:60");
                    } else if (age < 18) {
                        System.out.println("价格:30");
                    } else if (age > 60) {
                        System.out.println("价格:20");
                    }
                } else {
                    System.out.println("输入年龄有误");
                }
            } else {
                if (age > 0 && age < 130) {
                    if (age >= 18) {
                        System.out.println("价格:40");
                    } else {
                        System.out.println("价格:20");
                    }
                } else {
                    System.out.println("输入年龄有误");
                }
            }
        } else {
            System.out.println("输入月份有误");
        }
    }
}

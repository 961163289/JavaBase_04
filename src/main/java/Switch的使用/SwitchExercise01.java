package Switch的使用;

import java.util.Scanner;

public class SwitchExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入(a-e): ");
        char c1 = scanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("你的输入有误~");
        }

        double score = 88.5;
        if (score >= 0 && score <= 100) {
            switch ((int) score / 60) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
            }
        } else {
            System.out.println("输入的成绩在0-100");
        }

        int mth = 1;
        if (mth>=1&&mth<=12){
            switch (mth){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
                default:
                    System.out.println("输入有误");
            }
        }

    }
}

package DoWhile循环_5;

import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("老韩问:还钱吗?y/n");
            char c1 = scanner.next().charAt(0);
            switch (c1) {
                case 'y':
                    flag = false;
                    break;
                case 'n':
                    System.out.println("使用五连鞭~~~");
                    flag = true;
                    break;
            }
        } while (flag);
        System.out.println("终于肯还钱了,老赖!");
    }
}

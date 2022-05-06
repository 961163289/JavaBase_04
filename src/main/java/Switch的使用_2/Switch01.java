package Switch的使用_2;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g):");
        char c1 = scanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("今天星期一,猴子穿新衣");
                break;
            case 'b':
                System.out.println("今天星期二,猴子当小二");
                break;
            case 'c':
                System.out.println("今天星期三,猴子爬雪山");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}

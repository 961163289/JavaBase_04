package 多重循环_6;

public class stars {
    public static void main(String[] args) {
        int totalLeavel = 10;
        for (int i = 1; i <= totalLeavel; i++) {
            //在输出*之前,还要输出空格
            for (int k = 1; k <= totalLeavel - i; k++) {
                System.out.print(" ");
            }
            //控制打印每层的*个数
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == totalLeavel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //每打印完一层的*后,就换行
            System.out.println();
        }
    }
}

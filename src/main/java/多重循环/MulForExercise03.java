package 多重循环;

public class MulForExercise03 {
    public static void main(String[] args) {
        //打印出九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" * "+i+" = "+(j*i)+"   ");
            }
            System.out.println();
        }
    }
}

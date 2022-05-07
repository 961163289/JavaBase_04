package While循环;

public class WhileExercise {
    public static void main(String[] args) {
        //打印1-100之间所有能被3整除的数 [使用while]
        int i = 1;
        int endNum = 100;
        while (i <= endNum) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
            i++;//变量自增
        }
        System.out.println();

        //打印40-100之间所有的偶数 [使用while]
        int j = 40;
        int endNum1 = 200;
        while (j <= endNum1) {
            if (j % 2 == 0) {
                System.out.println("j = " + j);
            }
            j++;//变量自增
        }
    }
}

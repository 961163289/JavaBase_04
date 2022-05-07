package DoWhile循环;

public class DoWhile01 {
    public static void main(String[] args) {
        //输出10句 你好,韩顺平教育~
        int i = 1;//循环变量初始化
        do {
            //循环执行语句
            System.out.println("你好,韩顺平教育~"+i);
            i++;//循环变量迭代
        }while (i<=10);
        System.out.println("退出DoWhile,继续..." + i);
    }
}

package 本章作业;

public class Homework07 {
    public static void main(String[] args) {
        double num = 1;
        double num1 = 1;
        //隐藏的陷阱:要把 公式分子 1 写成 1.0 才能得到精确的小数
        for (double i = 2; i <= 100; i++) {
            //判断为奇数还是偶数,然后做不同的处理
            if (i%2==0){//分母为偶数
                num-=(num1/i);
            }else {//分母为奇数
                num+=(num1/i);
            }
        }
        System.out.println(num);
    }
}

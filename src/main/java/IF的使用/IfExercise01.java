package IF的使用;

public class IfExercise01 {
    public static void main(String[] args) {
//        double num1 = 15;
//        double num2 = 18;
//        if (num1 > 10.0 && num2 < 20.0) {
//            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//        } else {
//            System.out.println("数据不匹配,请重新确认!");
//        }

        int num3 = 20;
        if (num3 % 3 == 0) {
            if (num3 % 5 == 0) {
                System.out.println("此数可被3和5整除");
            } else {
                System.out.println("此数可以被3整除");
            }
        } else if (num3 % 5 == 0) {
            System.out.println("此数可以被5整除");
        } else {
            System.out.println("以上条件均不匹配");
        }

        int num4 = 2404;
        if ((num4 % 4 == 0 && num4 % 100 != 0) || num4 % 400 == 0) {
            System.out.println(num4 + "年为闰年");
        } else {
            System.out.println(num4 + "年不是闰年");
        }


    }
}

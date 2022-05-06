package 本章作业_9;

public class Homework01 {
    public static void main(String[] args) {

        int count = 0;
        double money = 100000;

        //方式1
        while (true) {
            if (money > 50000) {
                money *= (1 - 0.05);
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }

//        //方式2
//        while (money > 50000) {
//            money *= (1 - 0.05);
//            count++;
//            if (money <= 50000) {
//                break;
//            }
//        }
//        while (money <= 50000) {
//            money -= 1000;
//            count++;
//            if (money < 1000) {
//                break;
//            }
//        }

//        //方式3
//        while (money >= 1000) {
//            if (money > 50000) {
//                money *= (1 - 0.05);
//                times++;
//            } else if (money <= 50000) {
//                money -= 1000;
//                times++;
//            }
//            System.out.println("剩余: " + money + " " + times);
//        }

        System.out.println("剩余金额: " + money);
        System.out.println("次数: " + count);


    }
}

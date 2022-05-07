package Break的使用;

public class Test {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;

        //do-while循环

//        do {
//            i = (int) (Math.random() * 100 + 1);
//            System.out.println("i = " + i);
//            j++;
//        } while (i != 97);
//        System.out.println(j);

        //for循环
//        for (;;){
//            i = (int) (Math.random() * 100 + 1);
//            System.out.println("i = " + i);
//            j++;
//            if (i==97){
//                break;
//            }
//        }

        //while循环
        while (i != 97){
            i = (int) (Math.random() * 100 + 1);
            System.out.println("i = " + i);
            j++;
            if (i==97){
                break;
            }
        }
        System.out.println("次数 = "+j);
    }
}

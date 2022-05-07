package Return的使用;

public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                System.out.println("i = "+i);
//                break;
//                continue;
                return;
            }
            System.out.println("Hello World!");
        }
        System.out.println("go on..");
    }
}

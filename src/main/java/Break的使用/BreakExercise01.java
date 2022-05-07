package Break的使用;

public class BreakExercise01 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
            if (sum > 20) {
                n = i;
                break;
            }
        }
        System.out.println("当前数 = " + n);
        System.out.println("sum = " + sum);
    }
}

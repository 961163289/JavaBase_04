package Break的使用;

public class EqualTest {
    public static void main(String[] args) {
        String name = "贾宝玉";
        System.out.println(name.equals("贾宝玉"));//T
        System.out.println("贾宝玉".equals(name));//T [推荐,可以避免空指针]
    }
}

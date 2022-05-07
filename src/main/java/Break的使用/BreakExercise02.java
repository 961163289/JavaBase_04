package Break的使用;

import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {

        // 思路分析
        // 1. 创建Scanner对象接收用户的输入
        // 2. 定义 String name; String passwd; 保存用户名和密码
        // 3. 最多循环3次[登录3次],如果 满足条件就提前退出
        // 4. 定义一般变量 int change; 记录还有几次登录机会

        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for (int i = 0; i <= 3; i++) {
            System.out.println("请输入名字: ");
            name = myScanner.next();
            System.out.println("请输入密码:");
            passwd = myScanner.next();
            //比较输入的名字和密码是否正确
            //补充说明: 字符串的比较使用的方法为equal
            if ("丁真".equals(name) && "666".equals(passwd)) {
                System.out.println("恭喜你,登录成功~");
                break;
            }
            //登录的机会就减少一次
            chance--;
            System.out.println("你还有" + chance + "次登录机会");
            if (chance==0){
                break;
            }
        }


    }
}

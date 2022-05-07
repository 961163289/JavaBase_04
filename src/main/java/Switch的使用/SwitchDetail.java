package Switch的使用;

public class SwitchDetail {
    public static void main(String[] args) {
        //细节1
        //表达式数据类型,应和case后的常量类型一致
        //或者是可以自动转换成可以相互比较的类型,比如输入的是字符,而常量是 int

        //细节2
        //switch(表达式)中表达式的返回值必须是:
        //(byte, short, int, char, enum, String)

        //细节3
        //case字句中的值必须是常量(1,'a')或者是常量表达式,而不能是变量

        //细节4
        //default子句是可选的,当没有匹配的case时,执行default
        //如果没有default子句,又没有匹配任何常量,则没有输出

        //细节5
        //break语句用来在执行完一个case分支后 使程序跳出switch语句块;
        //如果没有写break,程序会顺序执行到switch结尾,除非执行到break
        char c = 'a';
        switch (c){
            case 'a':
                System.out.println("ok1");
                break;
            case 20:
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
                break;
        }
    }
}

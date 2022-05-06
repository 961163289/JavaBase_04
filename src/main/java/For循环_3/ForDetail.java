package For循环_3;

public class ForDetail {
    public static void main(String[] args) {

        //for (; 循环判断条件; )
        //中的初始化和变量迭代可以写到其他地方,但是两边的分号不能省略

        //使用for循环控制
//        int i = 1;//循环变量初始化
//        for (; i <= 10; ) {
//            System.out.println("你好,韩顺平教育! " + i);
//            i++;
//        }
//        System.out.println(i);//1

//        for (;;){//表现一个无限循环,死循环+break
//            System.out.println("ok~");
//        }

        //循环初始值可以有多条初始化语句,但要求类型一样,并且中间用逗号隔开
        //循环变量迭代也可以有多条变量迭代语句,中间用逗号隔开
        int count = 3;
        for (int i =0,j=0;i<count;i++,j+=2){
            System.out.println("i = "+i+", j = "+j);
        }
    }
}

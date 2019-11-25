package test;
/*
*  continue终止当前本次循环
* */
public class Java13_continue {
    public static void main(String[] agse){
        for (int i = 0;i < 10 ;i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);//因为continue原因不输出5，直接下一次执行输出6
        }
        System.out.println("hello world");
    }
}

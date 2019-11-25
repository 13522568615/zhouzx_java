package test;
/*
* breck终止最近的内循环，无法终止外层循环
*
* */
public class Java12_break {
    public static void main(String[] agse) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);//因为continue原因不输出5，直接下一次执行输出6
        }
        System.out.println("hello world");
    }
}

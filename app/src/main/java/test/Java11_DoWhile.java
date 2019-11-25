package test;
/*
*   do...while循环：
*       语法结构
*           do{
*               循环体；
*           }while(布尔表达式)；
*       循环原理
*
*
*       执行次数
*           1-N次，至少1次
*
*       注意事项
*           do...while循环语句最终有一个分号
*
*
*
**/
public class Java11_DoWhile {
    public static void main(String[] agse){
        int i = 1;
        do{
            System.out.println(i);
            i+=1;
        }while(i<10);
    }
}

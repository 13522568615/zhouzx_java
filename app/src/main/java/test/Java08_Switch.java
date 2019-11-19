package test;


/*
    关于Switch语句也属于选择结构，也是分支语句
    Switch语句的语法结构：
        switch(int或string类型的变量){
            case int或String类型的字面值或变量;
                java语句;
                ...
                break;
            case int或String类型的字面值或变量;
                java语句;
                ...
                break;
            default :
                java语句;
                ...
        }
    switch执行原理
        switch后面小括号的数据和case后面的数据进行一一匹配

*/
public class Java08_Switch {
    public static void main(String[] agse){
        //编译报错
        /*long a = 100L;
        switch (a){*/

        //int,String,byte,short,char都没问题
        /*long a = 100L;
        switch ((int)a){}*/

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入数字");
        int num = s.nextInt();
        switch (num){
            case 1: case 0://case合并
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("对不起您输入的数字有误");
        }
    }
}

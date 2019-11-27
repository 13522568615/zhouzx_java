package test;
/*
    深入return语句
        带有return关键字的java语句只要执行，所在的方法执行结束
        在同一个作用域当中return语句下面不能编写任何代码，因为
            这些代码永远都执行不到，所以编译报错

*/
public class Java14_Method04 {
    public static void main(String[] aegs){
        //int value = m();
        System.out.println(m());
    }
/*    //缺少返回语句，下面的语句是真和假,无法百分百保证return 1会执行
    public static int m(){
        int a = 10;
        if (a>3){
            return 1;
        }
    }*/

/*  public static int m(){
        int a = 10;
        if (a > 3){
            return 1;
        }else{
            return 0;
        }

    }*/
    public static int m(){
        return 3 > 3 ? 1 : 0;
    }
}

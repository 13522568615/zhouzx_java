package test;
/*
    89集
    方法的返回值类型不是void的时候
        1、返回值类型不是void的时候要求方法百分之百的执行return值
*/
public class Java14_Method03 {
    public static void main(String[] srgs){

        //赋值运算符的右边先执行，将执行的结果赋值给左边变量
        int c = Java14_Method03.divide(6,2);
        System.out.println(c);

        //可以直接打印输出
        System.out.println(Java14_Method03.divide(4,2));
    }

    /*
        需求：
            请定义并实现一个方法，该方法可以计算两个int类型数据的商，
            要求将最终的计算结果返回给调用者

    */
    //编译报错
/*    public static int divide(int a,int b){

    }*/
    public static int divide(int a,int b){
        return a / b;
    }
}

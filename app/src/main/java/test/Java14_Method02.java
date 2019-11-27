package test;
/*
     87集，88集
     方法调用：
        有的时候类名.可以省略

     main方法最先被调用，也是最后一个结束（仅限于该程序运行）

*/
public class Java14_Method02 {

    public static void main(String[] args){
        //调用方法
        Java14_Method02.m();

        //对于方法的修饰符列表当中有static关键字的：类名.可以省略不写
        m();

        //调用其他类中的方法
        A.hello();

        //从同目录下调用其他类
        Java14_Method01.hello();

        //本包内其他类下的方法
        A.m();
    }
    public static void m(){
        System.out.println("m");
    }
}

class A {
    public static void hello() {
        System.out.println("HELLO");
    }

    public static void m() {
        System.out.println("m");
    }
}
package test;
/*
        方法的调用不一定在main方法当中，可以在其他方法当中。
        只要是程序可以执行到的位置，都可以去调用其他方法。

*/
public class Java14_Method01 {
    public static void sum(int i,int j){
        System.out.println(i+"+"+j+"="+(i+j));

        Java14_Method01.hello();
    }

    public static void main(String[] args){
        Java14_Method01.sum(1,2);

        System.out.println("呵呵");
    }

    public static void hello(){
        System.out.println("hello!");
    }
}

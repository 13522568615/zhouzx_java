package test;
/*
        在返回值类型是void的方法当中使用“return”语句



*/
public class Java14_Method05 {
    public static void main(String[] srgs){

        Java14_Method05.m();
    }

    public static void m(){
        for (int i=0;i<10;i++) {
            if (i == 5) {
                return;//终止的不是for循环终止的是方法
                //break;//终止的是for循环
            }
            System.out.println(i);
        }
        System.out.println("m");
    }
}

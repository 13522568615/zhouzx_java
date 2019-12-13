package test;

/*
    94集、95集
    方法
        方法执行过程中的内存分配
        方法重载
        方法递归



*/
public class Java15_Method02 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int reValue = sumInt(a,b);
        System.out.println(reValue);//10
    }

    public static int sumInt(int i,int j){
        int result = i + j;
        int num = 3;
        int reValue = divide(result,num);
        return reValue;
    }

    public static int divide(int x,int y){
        int z = x/y;
        return  z;
    }
}

package test;
/*
    使用递归计算1-n的和
    105集-107集结束
* */
public class Java_Recursion01 {
    public static void main(String[] agse){
        int n = 4;
        int retValue = sum(n);
        System.out.println(retValue);
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n * sum(n-1);//先做运算在做加减
    }
}

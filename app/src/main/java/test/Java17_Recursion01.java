package test;
/*
    使用递归计算1-n的和
    105集-107集结束
* */
public class Java17_Recursion01 {
    public static void main(String[] agse){
        int n = 5;
        int retValue = sum(n);
        System.out.println(retValue);

        //闲的没事自己练习下
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + j*i + "  ");
            }
            System.out.println("\n");
        }
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n * sum(n-1);//现在还行右侧N-1，调用自身完成后在进行加减乘除
    }
}

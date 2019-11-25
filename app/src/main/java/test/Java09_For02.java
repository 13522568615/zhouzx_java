package test;
/*
*   在前一个程序的基础之上，计算1-100所有奇数的和
* */
public class Java09_For02 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<100;i+=2){
            //i一定是奇数
            //累加求和
            //System.out.println(i);

            //sum存储的是最终求和的结果
            //不能每一次执行到这里，都把求和结果归零。
            //定义sum不能放到这里面，美味这里是循环体
            //int sum = 0;
            sum = sum + i;
            //sum+=i;
        }
        System.out.println(sum);
    }
}

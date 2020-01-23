package test;
/*
*   素数分析
*   判断条件1：只能被1和本身整除的称为素数；
    判断条件2：在区间（1，x/2）中找不到能整除素数x的整数；
    判断条件3：在区间（1，sqrt(x)）中找不到能整除素数x的整数；
*
* */
public class Java09_For05 {
    public static void main(String[] agse){
        //作业
        //编写for循环找出1-100中所有的素数
        //素数：又称为质数，能够被1和自身整除，不能被其他数字整除的数字
        //并且每8个换一行
        int count = 0;
        for (int i=2;i<=100;i++) {//取值范围在1-100
            boolean shisushu = true;//默认将I看做一个素数【标记在开发中比较常用】
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //非素数
                    //已经知道I是非素数
                    shisushu = false;//如果上述条件成立，就回返回false
                    break;
                }
            }
            //根据shisushu的值判断是否输出i
            if(shisushu){
                System.out.print(i + " " );
//                count++;
//                if (count % 8 == 0){
//                    System.out.println("\n");
//                }
            }

        }
        System.out.println("\t");
        System.out.println("-----------------------------------");
        SuShu s = new SuShu();
        s.suShu();
    }
}

class SuShu{
    public void suShu(){
        int num;//被除数
        int g;//除数
        int sum = 0;//累加数
        for (num=2; num<=100; num++){// num值为2，质数为除去1和自身整除的数 num初始值为2去除偶数
            for (g=2; g<=num; g++){//内层循环遍历查询num的整除数
                if (num%g==0){ //判断当前num是否可以整除g值
                    break;//整除则跳出循环
                }
            }
            //如果当前内循环没有正常结束g与num对比不成立
            if (g > num-1){//计算当前的g值是否等于num-1的值 ，相等则说明为质数
                sum = sum + num;//累加素数
                System.out.print(num + " ");//输出素数
            }
            System.out.println("\t");
            System.out.print(sum + " ");//输出素数的和
        }
    }
}
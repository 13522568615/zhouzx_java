package test;

public class Java09_For05 {
    public static void main(String[] agse){
/*        //99乘法表
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + j*i + "  ");
            }
            System.out.println("");
        }*/


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
                    //break;
                }
            }
            if(shisushu){
                System.out.print(i + "  " );
                count++;
                if (count % 8 == 0){
                    System.out.println("\n");
                }
            }

        }
    }
}

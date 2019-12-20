package test;

import android.view.SubMenu;

/*
    方法的递归调用102集
        1、什么是递归
            方法自身调用自身
                a(){
                    a();
                }
        2、递归是非常耗内存的

        3、以下程序运行的时候，发生了这样的出一个错误【不是异常，是错误ERROR】
            java.long.StackOverfloeError
            内存溢出错误
            错误发生无法挽回，只有一个结果，就是JVM停止工作

        4.递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误

        5、有结束条件也可能会出现异常错误。

        注意：
            递归可以不适用尽量别用
            但是用些情况下该功能需要使用

---------------------------------------------------------------------

        不使用递归，计算1-N的和

*/
public class Java17_Recursion {
    public static void main(String[] sgse){
        int n = 4;
        int retValue = sum(n);
        System.out.println(retValue);
    }

    public static int sum(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            result += i;
        }
        return result;
    }
}

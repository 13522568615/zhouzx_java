package test;
/*
*       for循环嵌套99乘法表
* */
public class Java09_For04 {
    public static void main(String[] aegs){

/*        for (int i=0;i<10;i++){
            for (int j=0;j<1;j++){
                System.out.println(j);//10个0
            }
        }*/

        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i + "x" + j + "=" + j*i + "  ");
            }
            System.out.print("\n");
        }
    }
}

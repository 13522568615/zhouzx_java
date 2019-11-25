package test;
/*
*   嵌套for循环
* */
public class Java09_For03 {
    public static void main(String[] srgs){
        for (int i=0;i<5;i++){
            System.out.println("i--->" + i);//i打印5次
            //共循环10次
            //循环体重可以编写其他的控制语句
            //控制语句可以嵌套使用
/*            if(){
                for(){
                    while(){
                        if(){
                            for(){

                            }
                        }
                    }
                }
            }*/
            //i每循环1次，J循环两次
            for (int j=0;j<2;j++){
                System.out.println("j--->" + j);//j打印10次

                // i每循环1次=5次

                // J循环两次=10次
                // j=0的时候，k打印0,1
                // j=1的时候，k打印0,1

                // k循环4次=20次
                for (int k=0;k<2;k++){
                    System.out.println("k--->" + k);//k打印20次
                    //System.out.println("---------");
                }
                //内层循环01，外层循环10次，总共打印10次01
            }
        }

    }
}

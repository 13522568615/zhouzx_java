package test;
/*
    循环语句和条件判断语句嵌套使用【for和if的嵌套】
    += 就是专门完成追加的

*/
public class Java09_For {
    public static void main(String[] ages){
        //找出1-100的所有奇数
        //第一种方案：从1开始，每次递增2，这样每一个数据一定是奇数
        for (int i=1; i<=100; i+=2){
            System.out.println("奇数："+ i);
        }
        //第二种方案：从1开始，以1递增，每一个数据都进行判断，判断标准是该数字对2求于
        for (int i=1; i<=100; i++){
            /*判断i是否为奇数，是奇数的时候输出
            * i % 2 == 0偶数
            * i % 2 == 1奇数
            * i % 2 != 0奇数*/
            if (i % 2 != 0){
                System.out.println(i);
            }
        //以上两种方案，优先选择第一种方案，代码少，效率高
        }
    }
}

package test;

/*
    98集、99集、100集
    方法重载机制overload

    只有在功能相似的时候采用重载

    方法重载：
        1、方法重载又被成为overload

        2、什么时候考虑使用方法重载
            功能相似的时候，尽可能让方法名相同

        3、什么条件满足之后构成了方法重载
            方法重载只和方法名与参数列表有关
            在同一个类当中
            方法名相同
            参数列表不同
                -数量不同
                -顺序不同
                -类型不同



*/
public class Java16_Overload {
    public static void main(String[] aegs){
        m1();
        m1(10);

        m2(2,2.0);
        m2(2.0,2);

        m3(2);
        m3(2.0);
    }

    //以下两个方法构成方法重载 -数量不同
    public static void m1(){}
    public static void m1(int a){}

    //以下两个方法构成方法重载 -顺序不同
    public static void m2(int a,double b){}
    public static void m2(double a,int b){}

    //以下两个方法构成方法重载 -类型不同
    public static void m3(int a){}
    public static void m3(double a){}

    //以下两个不是方法重载，是方法重复
/*    public static void m3(int a,int b){}
    public static void m3(int b,int a){}*/

}

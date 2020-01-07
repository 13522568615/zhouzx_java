package test;
/*
    可以使用static关键字来定义静态代码块
       1、语法格式：
            static{
                java语句;
            }

       2、静态代码块在类加载时执行，并且只执行一次

       3、静态代码块在一个在类中可以编写多个，并且遵循自上而下执行

       4、静态代码块在实际开发中的使用
           - 和具体的需求有关，列如项目中要求在类加载的时刻/时机执行代码完成日志的记录
             那么这段记录日志的代码就可以编写到静态代码快当中，完成日志记录
           - 静态代码块是java为程序员准备的特殊的时刻，这个特殊的时刻被称为类加载时刻。
             若希望在此时刻执行一段特殊的程序，这段程序可以直接放到静态代码当中。

       5、通常在静态代码块当中完成预备工作，先完成数据的准备工具，列如：初始化连接池等
* */
public class Java22_Static01 {

    static{
        System.out.println("类加载");
    }
    static{
        System.out.println("类加载1");
    }

    public static void main(String[] aegs){

        System.out.println("main begin");

    }
}

package test;

/*  变量：
        1、什么是变量
            变量本质上说的是内存中的一块空间，这块空间有数据类型、有名字、有字面值
            变量包含三部分，数据类型，名称。字面值
            变量是内存中存储数据的最基本的元素

        2、数据类型的作用
            bu不同的数据有不同的类型，不同的数据类型底层会分配不同大小的空间
            数据类型是指导程序在运行阶段应该分配多大的内存空间

        3、变量要求：变量中存储的具体的数据必须和变量的数据数据类型一致，当不一致的时候编译报错

        4、声明、定义变量语法的格式：
            数据类型+空格+变量名;

            int是数据类型

        5、变量声明之后怎么赋值？
            语法格式：
                变量名 = 字面值；
            要求：字面值的数据类型必须和变量的数据类型一致。
            = 等号是一个运算符，叫做赋值运算符，先执行右边的表达式

        6、声明和赋值可以放到一起完成。
            int i = 10;

        7、变量赋值后，可以重新赋值，变量的值可变化

        8、通常访问一个变量包括两种访问形式
            -1、读取变量中保存的具体数据 get获取
            -2、修改变量中保存的具体数据 set设置

            i = 20; //set
            System.out.pringln(i); //get
 */

public class Java04_Var01 {
    public static void main(String[] agse){
        int i;
        i = 10;
        System.out.println(i);

        i = 20;
        System.out.println(i);
/*
    在方法体当中的java代码，是遵守自上而下，先声明然后复制在访问
*/
        int a,b,c = 30;
        a = 10;
        b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
/*
    在同一个作用域当中，变量名不能重名，但是变量可以重新赋值
*/
        int k = 100;
        System.out.println(k);

        /*
        * 变量的作用域
        *   -什么是作用域？
        *       -变量的作用域，描述的就是变量的有效范围
        *           在范围内是可以被访问的
        *
        * */
        int j;
        for (j=0;j<10;j++){

        }
        System.out.println(j);

    }
}

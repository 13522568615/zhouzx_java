package test;

/*  数据类型两大类
*       基本数据类型
*
*       引用数据类型
*
*
*   关于数据类型：
*       基本数据类型包括四大类八小种：
*           第一类：整数型
*               byte：1字节---[-128-127]
*               short：2字节
*               int：4字节
*               long：8字节
*           第二类：浮点型
*               float：4字节
*               double：8字节
*           第三类：布尔型
*               boolean：2字节
*           第四类：字符型
*               char：1字节---[0-65535]
*
*       字符串“ABD”不属于基本主句类型，属于引用数据类型
* */
public class Java05_DateType {
    //这里的static必须加
    static int k = 1000;

    static int f;

    public static void main(String[] agse){

        System.out.println(k);

        //f值默认为0
        System.out.println(f);

        //char
        char c = 'a';
        System.out.println(c);

        //声明
        char e;
        //赋值
        e = 'e';
        //再次赋值
        e = 'f';
        System.out.println(e);


        //转义字符
        char c1 = 'n';
        System.out.println(c1);

        //\n转义功能，换行符
        char c2 = '\n';
        System.out.println(c2);

        //\t代表制表符，tab键

        char g = '\u4e2d';
        System.out.println(g);


    }
}



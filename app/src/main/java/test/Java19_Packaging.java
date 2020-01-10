package test;

/*
*   封装课程130
* */

/*
    用户类

* */

class User{

    //年龄
    int age;
}

/*
    测试类
    对于当前程序来说：
        User类中的age树形在外部程序中可以随意访问，导致age属性的不安全。
        一个User对象标识一个用户，用户的年龄不可能为负数。一下程序当中年龄值
        为负数，程序运行的时候并没有报错，这是当前程序存在的缺陷。

    面向对象包括三大特征：
        封装
        继承
        多态

    当前讲解的是封装机制，封装的好处
        1、封装之后，对于那个事物来说，看不到这个事物比较复杂的那一面，只能看到简单的一面

        2、封装之后才会想成真正的“对象”，真正的独立体

        3、封装就意味着以后的程序可以重复使用，并且这个事物应该适应性比较强

        4、封装之后，对于事物本身，提高了安全性。【安全级别高】
* */
public class Java19_Packaging {

    public static void main(String[] arhs){

        User user = new User();
        //读取年龄
        System.out.println("该用户年龄:" + user.age);

        //修改年年龄
        user.age = 20;
        System.out.println("该用户年龄:" + user.age);

        //修改年龄
        user.age = -100;
        System.out.println("该用户年龄:" + user.age);
    }
}

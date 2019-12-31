package test;
/*
    131集结束
    关于java类中的构造方法：
        1、构造方法又被成为构造函数、构造器、Constructor
        2、构造方法语法结构：
            [修饰符列表] 构造方法名(形式参数列表){
                构造方法体；
            }
        3、普通方法的语法结构：
            [修饰符列表] 返回值类型 方法名(形式参数列表){
                方法体；
            }
        4、构造方法来说“返回值类型”不需要指定，并且也不能写void，
            只要写伤void那么这个方法就成为普通方法
        5、对于构造方法来说，构造方法的方法名必须和类名保持一致。
        6、构造方法的作用。
            构造方法存在的意义是，通过构造方法的调用，可以创建对象。
        7、构造方法应该怎么调用。
            - 普通方法是这样调用的：方法名中有static的时候：类名.方法名（实参列表）
                                方法命中没有static的时候：引用.方法名（实参列表）
            - new 构造方法名（实参列表）
        8、构造方法调用执行之后有返回值，会返回一个堆内存的内存地址（返回的类型永远返回自己）
        9、构造方法支持重载机制。

* */
public class Java20_Constructor {
    public static void main(String[] args){

        //创建UserB对象
        //调用UserB类的构造方法来完成创建对象
        //以下创建程序创建了4个对象，只要构造函数调用就会创建对象，并且一定在“堆内存”中开辟内存空间
        UserB u1 = new UserB();
        UserB U2 = new UserB(1);
        UserB U3 = new UserB("张三");
    }
}

class UserB{
    public UserB(){
        System.out.println("不带形式参数的构造器");
    }

    public UserB(int i){
        System.out.println("带有int类型的构造器");
    }

    public UserB(String name){
        System.out.println("带有String类型的构造器");
    }
}

package test;

/*
    多态（152集）
    关于java语言中的多态语法机制
        1、Animals、Cat、Birds三个类之间的关系：
            Cats继承Animals
            Birds继承Animals
            Cat和Birds之间没有任何继承关系

        2、面向对象三大特征：封装、继承、多态

        3、关于多态中涉及到几个概念：
            *向上转型(upcasting)
                子类型-->>父类型
                又被成为：自动类型转换

            *向下转型(downcasting)
                父类型-->>子类型
                又被成为：强制类型转换。【需要加强制类型转换】

            *需要记忆：无论是向上转型还是向下转型，两种类型之间必须要有继承关系

* */
public class Java25_Polymorphic {
    public static void main(String[] args){

        //以前编写的程序
        Animals a1 = new Animals();
        a1.move();
        Cats c1 = new Cats();
        c1.move();
        c1.catchMouse();
        Birds b1 = new Birds();
        b1.move();

        //------------------------------------------------------
        //使用多态语法机制
        /*
            1、Animals和Cats之间存在继承关系，Animals是父类，Cats是子类
            2、Cats is a Animals
            3、new Cat()创建的对象的类型是Cat，a2这个引用的数据类型是Animals，他们存在类型转换
                子类型转换父类型，称为向上转型/upcasting，或者称为自动类型转换。
            4、java中允许这种语法：父类型引用指向子类型对象。
        */
        Animals a2 = new Cats();
        /*
        *   1、java程序永远都分为编译阶段和运行阶段
        *   2、先分析编译阶段，在分析运行阶段，编译无法通过，根本是无法运行的。
        *   3、编译阶段编译器检查a2这个引用的数据类型为Animals，由于Animals.Class
        *       字节码当中有move()方法
        *   4、无论是Cat类有没有重写move方法，运行节点一定调用的是Cat对象的move方法，
        *       因为底层真是对象就是Cat对象。
        *
        * */
        a2.move();
        //--------------------------------------------------------
        /*
        *   分析以下程序为什么不能调用？
        *       因为编译阶段检查到a2的类型是Animals类型。
        *       从Animals.class字节码文件当中查找catchMouse()
        *       方法，最终没有找到该方法，到时静态绑定失败，没有
        *       绑定成功，也就是编译失败了。因此无法运行。
        * */
        //a2.catchMouse();
        //--------------------------------------------------------
        /*
        *   假设想让以上的对象执行catchMouse()方法，怎么办？
        *       a2是无法直接调用的，因为a2的类型Animals，Animals中
        *           没有catchMouse()方法
        *
        *       我们可以将a2强制类型转换为Cat类型。
        *       a2的类型是Animals（父类），转换成Cat类型（子类），
        *       被称为向下类型/downcasting/强制类型转换。
        *
        *       强制类型转换需要加强制类型转换符
        *
        *   注：两者之间需要有继承关系
        *       什么时候需要使用向下转型呢？
        *       当调用的方法是子类型中特有的，在父类型当中不存在的，必须进行向下类型转型
        *
        * */
        Cats c2 = (Cats)a2;
        c2.catchMouse();
        //------------------------------------------------------

        //父类型引用指向子类型对象【多态】
        Animals a3 = new Birds();
        /*
        *   1、以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animals
        *       Animals和Cat之间存在的继承关系，并且Animals是父类型，Cat是子类型，
        *       父类型转换成子类型叫做向下转型/downcasting，语法合格。
        *
        *   2、程序虽然编译通过了，但是程序在运行阶段会出现异常，因为jvm堆内存当中
        *       真是存在的对象是Birds类型,Birds对象无法转换成Cat对象，因为两种类型
        *       之间不存在任何继承关系，此时出现异常
        *           java.lang.ClassCastException
        *           类型转换异常，这种异常总是在向下转型的时候会发生
        *
        * */
//        Cats c3 = (Cats)a3;
//        c3.move();

        //----------------------------------------------------------
        //如何避免出现以上异常呢
        /*
        *   使用instanceof运算符可以避免出现以上的异常。
        *       1.instanceof运算符怎么用？
        *           (1)语法结构：
        *               （引用 instanceof 数据类型名）
        *           (2)以上运算符的执行结果类型是布尔类型，结果可能是true/false
        *           (3)关于运算结果true/false:
        *                假设：(a instanceof Animals)
        *                true表示：
        *                   a这个引用指向的对象是一个Animals类型
        *                false表示：
        *                   a这个引用指向的对象不是一个Animals类型
        *       2、java规范中要求，在进行强制类型转换之前，建议采用instanceof运算符进行判断，
        *               避免ClassCastException异常的发生
        * */

        if (a3 instanceof Cats){//a3是一个Cats类型的对象
            Cats c3 = (Cats)a3;
            c3.catchMouse();//条件没有成立，指向的是鸟类型的对象
        }else if (a3 instanceof Birds){//a3是一个Birds类型的对象
            Birds b2 = (Birds)a3;
            b2.fly();
        }

        /*
        *       以下是完整程序：
        *           向上转型
        *           Animals a1 = new Cats();
        *           Animals a2 = new Birds();
        *
        *           向下转型
        *           if (a1 instanceof Cats)
                        Cats c1 = (Cats)a1;
                    }
                    if (a2 instanceof Birds){
                        Birds b1 = (Birds)a2;
                    }
        * */
    }
}


class Animals{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cats extends Animals{

    //重写父类继承过来的方法

    public void move(){
        System.out.println("猫在走猫步");
    }

    //不是从父类中继承过来的方法
    //这个方法是子类对象特有的行为
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Birds extends Animals{

    //重写从父类继承过来的方法
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public void fly(){
        System.out.println("Bird fly!");
    }
}
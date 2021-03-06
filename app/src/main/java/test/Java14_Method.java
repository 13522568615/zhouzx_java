package test;
/*
    82集、83集、84集
    方法对应的单词是：Method
    方法就是一段代码片段，并且这点代码可以完成某个特定的功能，可以重复的使用
    方法是定义在类体当中
    一个类可以定义多个方法
    方法体当中不能再定义方法
    方法的重载机制overload

    关于java语言中的方法
        1、方法怎么定义，语法结构：
            【修饰符列表】 返回值类型 方法名（形式参数列表）{
                方法体;
             }

        2、对以上的语法结构进行解释说明：
            1、关于修饰符列表
                *可选项，不是必须的
                *目前统一写成：public static
                *方法的修饰符列表当中有static关键字的话，怎么用这个方法？
                    - 类名.方法名（实际参数列表）;

            2、返回值类型
                *什么是返回值
                    一个方法是可以完成某个特定的功能，这个功能结束之后大多数
                    需要返回最终执行记过的，执行结果可能是一个具体存在的数据
                    ，而这个具体存在的数据就是返回值
                *返回值类型
                    java中任意一种类型都可以
                    byte,short,int,long等等
                *也可能这个方法执行结束后不返回任何数据，返回值类型位置必须
                    填写void
                *返回类型是void的时候，在方法体中不能编写return 值;语句，
                    但是可以编写return;语句

            3、方法名：
                只要是合法的标识符就行
                方法名最好是动词
                方法名最好是见名之意
                最好首字母小写后续首字母大写

            4、形式参数列表（形参）
                形参是局部变量：int a; double b; float c;
                形参的个数可以是0-N个
                多个形参用都好隔开

            5、方法体必须由大括号括起来，方法体当中的代码有顺序，自上而下执行
                方法体有java语句构成

        3、方法怎么调用？
            方法规则：《方法的修饰列表当中有static》
                类名.方法名（实参列表）


* */
public class Java14_Method {
    //public公开的
    //static静态的
    //void方法执行结束之后不返回任何数据
    //main主方法
    //(String[] args)形式参数列表，String[]是一种引用数据类型，args局部变量名
    public static void main(String[] args) {
        Java14_Method.sumInt(1,2);
    }
    //自定义方法，不是程序的入口
    //方法作用：计算两个int类型数据的和，不要求返回结果，但是要求结果直接输入到控制台
    public static void sumInt(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }
}

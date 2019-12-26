package test;
/*
    对象的创建和使用
    112集

*/


public class Java18_1OOTest {


    public static void main(String[] aegs){

        //通过一个类可以实例化N个对象
        //实例化对象的语法：new类名();
        //new是java语言当中的一个运算符
        //new运算符的作用是创建对象，在JVN堆内存当中开辟新的内存空间
        //方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间当中
        //栈内存(局部变量)：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
        //堆内存：new的对象在堆内存中存储
        //Java18_Stedent是一个引用数据类型
        //s是一个局部变量
        //new Java18_Student是学生对象
        //Java18_Student s;是一个局部变量【在栈内存中存储】
        //什么是对象？new运算符在堆内存中开辟的内存空间称为对象
        //什么是引用？引用是一个变量，只不过这个变量保存了另一个java对象的内存地址
        //java语言当中，程序员不能直接操作堆内存，java中没有指针
        //java语言当中，程序员只能通过“引用”去访问堆内存当中对象内部的实例变量
        int i = 10;//i在栈内存中保存的是字面值

        Java18_Student s = new Java18_Student();
        //Java18_Student称为对象
        //s在栈内存中保存的是另外一个对象的内存地址，s称为引用
        //访问实例变量的语法格式：

        System.out.println("读取数据：引用.变量值");
        System.out.println("方法1");
        int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        boolean stuSex = s.sex;
        String stuAddr = s.addr;

        U.pl("学号 = " + stuNo);//0
        U.pl("姓名 = " + stuName);//null
        U.pl("年龄 = " + stuAge);//0
        U.pl("性别 = " + stuSex);//false
        U.pl("住址 = " + stuAddr);//null
        System.out.println("--------------------------");

        System.out.println("方法2");
        U.pl("学号 = " + s.no);//0
        U.pl("姓名 = " + s.name);//null
        U.pl("年龄 = " + s.age);//0
        U.pl("性别 = " + s.sex);//false
        U.pl("住址 = " + s.addr);
        System.out.println("--------------------------");

        System.out.println("修改数据：引用.变量名 = 值");
        s.no = 10;
        s.name = "zzx";
        s.age = 10;
        s.sex = true;
        s.addr = "北京";

        U.pl("学号 = " + s.no);//0
        U.pl("姓名 = " + s.name);//null
        U.pl("年龄 = " + s.age);//0
        U.pl("性别 = " + s.sex);//false
        U.pl("住址 = " + s.addr);
        System.out.println("--------------------------");

        System.out.println("再通过类实例化一个全新的对象");
        //a是一个引用
        //a同时也是一个局部变量
        //Java18_Student是变量的数据类型
        Java18_Student a = new Java18_Student();

        s.no = 100;
        s.name = "zzxx";
        s.age = 100;
        s.sex = true;
        s.addr = "上海";

        U.pl("学号 = " + s.no);//0
        U.pl("姓名 = " + s.name);//null
        U.pl("年龄 = " + s.age);//0
        U.pl("性别 = " + s.sex);//false
        U.pl("住址 = " + s.addr);
    }
}

//成员变量没有手动复制的话，系统赋默认值

/*
    局部变量在栈内存中存储
    成员变量中的势力变量在堆内存的java对象内部存储

    实例变量是一个对象一份，100个对象有100份
* */


class Java18_Student {
    //类体 = 属性 + 方法

    //属性【存储数据采用变量的形式】
    //由于变量定义在类体当中，方法体之外，这种变量称为成员变量

    //对象被称为实例，实例变量又被称为对象变量
    //不创建对象，这个no变量的内存空间是不存在的
    int no;

    //姓名
    String name;

    //年龄
    int age;

    //性别
    boolean sex;

    //住址
    String addr;
}

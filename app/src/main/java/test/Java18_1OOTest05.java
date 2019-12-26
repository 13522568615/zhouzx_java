package test;
/*
    118-120集结束----练习题
    需求
        定义一个计算机类
            品牌
            型号
            颜色
            知道厂商地址

        定义一个学生类
            学号
            姓名
            有个笔记本电脑

        有个厂商类

        编写程序标识以上的类，然后分别将类创建为对象，
        对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑，并且知道厂商在哪

        所有代码写在一个java源文件当中
* */


public class Java18_1OOTest05 {
    public static void main(String[] args){

        Student s = new Student();
        s.number = 1;
        s.name = "小明";

        s.conputer = new NotebookConputer();
        s.conputer.brand = "MAC";
        s.conputer.type = "A1-1";
        s.conputer.colour = "银色";
        //s.conputer.money = 9000;
        s.conputer.c.cangSang = "上海";

        System.out.println(s.name + "同学有一台" + s.conputer.brand
                + "笔记本，型号是" + s.conputer.type +
                s.conputer.colour + ",价格大概在" + s.conputer.money
                + "左右,厂商地址在：" + s.conputer.c.cangSang);

    }
}

class ChangShang{
    String cangSang;
}

class NotebookConputer{
    String brand;//品牌
    String type;//型号
    String colour;//颜色
    double money;
    ChangShang c = new ChangShang();
}

class Student{
    int number;//学号
    String name;//名字
    NotebookConputer conputer;//笔记本

}


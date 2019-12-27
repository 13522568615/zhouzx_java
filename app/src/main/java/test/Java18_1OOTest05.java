package test;
/*
    118-123集结束----练习题
    需求
        定义一个计算机类
            品牌
            型号
            颜色
            价格
            知道厂商地址

        定义一个学生类
            学号
            姓名
            有个笔记本电脑

        有个厂商类
            厂商地址

        编写程序标识以上的类，然后分别将类创建为对象，
        对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑，并且知道厂商在哪，并且又新换了个笔记本

        所有代码写在一个java源文件当中
* */

//学生类
class Student{
    int number;//学号
    String name;//名字
    NotebookConputer conputer;//笔记本
}

//笔记本类
class NotebookConputer{
    String brand;//品牌
    String type;//型号
    String color;//颜色
    double money;//价格
    ChangShang cs;
}

//厂商类
class ChangShang{
    String cangSang;
}

public class Java18_1OOTest05 {
    public static void main(String[] args){

        //创建一个学生对象
        Student xueSheng = new Student();
        xueSheng.number = 1;
        xueSheng.name = "小明";

        //创建一个笔记本对象
        NotebookConputer biJiBen = new NotebookConputer();
        biJiBen.brand = "MAC";
        biJiBen.type = "A1-1";
        biJiBen.color = "银色";
        biJiBen.money = 9000;

        //创建厂商对象
        ChangShang cs = new ChangShang();
        cs.cangSang = "上海";

        //biJiBen赋值给xueSheng.conpute（引用.）
        xueSheng.conputer = biJiBen;

        //cs赋值给biJiBen.cs（引用.）
        biJiBen.cs = cs;

        System.out.println(xueSheng.name + "同学有一台" + xueSheng.conputer.brand
                + "笔记本，型号是" + xueSheng.conputer.type +
                xueSheng.conputer.color + ",价格大概在" + xueSheng.conputer.money
                + "左右,厂商地址在：" + biJiBen.cs.cangSang);

        //更换笔记本
        xueSheng.conputer.brand = "联想";
        System.out.println("又新买了个笔记本，品牌是：" + xueSheng.conputer.brand);

    }
}
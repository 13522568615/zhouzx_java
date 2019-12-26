package test;
/*
    118-119集练习题
    需求
        定义一个计算机类
            品牌
            型号
            颜色

        定义一个学生类
            学号
            姓名
            有个笔记本电脑

        编写程序标识以上的类，然后分别将类创建为对象，
        对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑

        所有代码写在一个java源文件当中
* */

class NotebookConputer{
    String brand;//品牌
    String type;//型号
    String colour;//颜色
}

class Student{
    int number;//学号
    String name;//名字
    String NotebookConputer;//笔记本
}

public class Java18_1OOTest05 {
    public static void main(String[] args){

        NotebookConputer nc = new NotebookConputer();
        nc.brand = "MAC";
        nc.type = "A1-1";
        nc.colour = "银色";

        Student s = new Student();
        s.number = 1;
        s.name = "小明";
        //s.NotebookConputer = brand;

        System.out.println(s.name + "同学有一台"  + "");

    }
}

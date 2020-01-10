package test;
/*
    继承(150完成)
    extends关键字

    关于java语言当中的继承
        1、继承是面向对象三大特征之一，分别是：封装，继承、多态

        2、继承基本的作用是：代码复用。

           但是继承最重要的作用是：有了继承才有了以后的“方法的覆盖和多态机制”

        3、继承语法格式：
            [修饰符列表] class 类名 extends 父类名{
                类体 = 属性 + 方法
            }

        4、java语言当中的继承只支持单继承，一个类不能同时集成很多类，只能继承一个类。在c++中支持多继承。

        5、关于继承汇总的一些术语
            B类继承A类，其中：
                A类称为：父类、基类、超类、superclass
                B类称为：子类、派生类、subclass

        6、在java语言中子类继承父类都继承那些数据
            -私有的不支持继承private
            -构造方法不支持继承
            -其他数据都可以被继承

        7、虽然java语言当中只支持单继承，但是一个类也可以间接继承其他类，列如：
            C ectends B{
            }
            B ectends A{
            }
            A extends T{
            }
            C类直接继承B类，但是C类间接继承T、A类。

        8、java语言中假设一个类没有显示的继承任何类，该类默认继承javaSE库当中提供的java.lang.Object类
           jva语言中任何一个类中都有Object类的特征

* */
public class Java23_extends {

    public static void main(String[] args){

        Java23_extends java = new Java23_extends();

        String s = java.toString();
        System.out.println(s);

        //继承
        CreditAccount cat = new CreditAccount();
        cat.setActno("cat-001");
        cat.setBalance(-1000.0);
        cat.setCredit(99);

        System.out.println("账户：" + cat.getActno() + ",余额：" + cat.getBalance() +
                ",信用值：" + cat.getCredit() + "%");
    }
}

//账户类
class Account_1{

    private String actno;
    private double balance;

    //构造方法无参
    public Account_1(){
    }

    //构造方法有参
    public Account_1(String actno, double balance){
        this.actno = actno;
        this.balance = balance;
    }

    //构造set,get方法
    public String getActno(){
        return actno;
    }
    public void setActno(String actno){
        this.actno = actno;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}

//信用卡  extends继承
class CreditAccount extends Account_1{
    private double credit;


    public CreditAccount(){
    }

    public double getCredit(){
        return credit;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }


}



















package test;
/*
    this关键字137集

    没有static关键字的方法被称为“实例方法
    没有static关键字的变量被称为“实例变量

    this可以出现在“实例方法”当中，this指向当前正在实行这个动作的对象。
    this在多数情况是可以省略不写的
    this不能使用在带有static的方法当中

* */
public class Java21_This {
    public static void main(String[] args){

        //当使用c1去访问该对象的话，整个过程中出现的this就是C1
        Customer c1 = new Customer();
        c1.name = "zhangsan";
        c1.Shopping();

        //当使用c2去访问该对象的话，整个过程中出现的this就是C2
        Customer c2 = new Customer();
        c2.name = "lisi";
        c2.Shopping();

        Customer.doSome();


    }
}

class Customer{

    //姓名
    String name;

    //构造方法
    public Customer(){

    }

    public void Shopping() {
        System.out.println(this.name + "去购物");
    }

    public static void doSome(){
        Customer c = new Customer();
        c.name = "wangwu";
        System.out.println(c.name);
    }
}

package test;
/*
    132集结束
    构造方法
    构造方法的作用就是：
        存在的意义创建对象
        创建对象的过程中给实例对象赋值

* */
public class Java20_Constructor01 {
    public static void main(String[] aegs){

/*        //创建对象
        Account account = new Account();

        //初始化实例变量空间
        account.getActno();
        System.out.println("账号1：" + account.getActno());

        account.getBalance();
        System.out.println("余额1：" + account.getBalance());

        account.setActno("zhouzongxin");
        System.out.println("账号：" + account.getActno());

        account.setBalance(1000);
        System.out.println("余额：" + account.getBalance());*/

        //初始化数据
        Account account2 = new Account();
        System.out.println(account2.getActno());
        System.out.println(account2.getBalance());

        //构造方法
        Account account1 = new Account("zhouzongxin",10000);
        System.out.println(account1.getActno());
        System.out.println(account1.getBalance());

    }
}

//账户类
class Account{

    //账号类
    private String actno;

    //余额类
    private double balance;

    //创建对象,构造函数起到初始化的作用
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public Account(){
        this("zhangsan",1111);
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
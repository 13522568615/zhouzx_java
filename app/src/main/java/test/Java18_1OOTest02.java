package test;

/*
    //入门114集

* */
public class Java18_1OOTest02 {
    public static void main(String[] args){
        //u是局部变量，引用类型
        Java18_User u = new Java18_User();
        //a是局部变量，引用类型
        Java18_Address a = new Java18_Address();
        u.addr = a;

        System.out.println(u.addr.city);
        a.city = "天津";
        System.out.println(a.city);
        a.city = "北京";
        System.out.println(u.addr.city);
    }
}

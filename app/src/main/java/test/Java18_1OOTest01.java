package test;
    //测试类113集
public class Java18_1OOTest01 {
    public static void main(String[] agse){

        Java18_User u = new Java18_User();

        System.out.println("输出user内部实例变量的值");
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);
        System.out.println("--------------------------");

        //引用是一个变量，变量也是局部变量和成员变量
        System.out.println("修改user内部实例变量的值");
        u.no = 100;
        u.name = "zhangsan";//是一个java对象属于String对象
        u.addr = new Java18_Address();
        u.addr.city = "北京";
        u.addr.street = "朝阳";
        u.addr.zipcode = "10000";

        System.out.println(u.no);
        System.out.println(u.name + "居住的城市在：" + u.addr.city);
        System.out.println(u.name + "居住的街道在：" + u.addr.street);
        System.out.println(u.name + "居住的邮编是：" + u.addr.zipcode);
    }
}

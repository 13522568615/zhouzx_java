package test;
/*
    117集空指针（NullPointerException）
* */

class Java18_Customer {
    //id
    int id;
}

public class Java18_1OOTest04 {
    public static void main(String[] args){

        Java18_Customer c = new Java18_Customer();
        System.out.println(c.id);

        c = null;
        //java.lang.NullPointerException
        //空引用访问“实例”相关的数据一定会出现空指针
        System.out.println(c.id);
    }
}
//静态存在方法区内存，实例变量存在堆内存，局部变量存在栈内存
//“实例”相关的数据表示：这个数据访问的时候必须由对象的参与，这种数据就是实例相关的数据。


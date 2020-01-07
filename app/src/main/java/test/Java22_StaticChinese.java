package test;
/*
    static关键字（静态变量）145集

    什么时候成员变量声明为实例变量
        所有对象都有这个属性，但是这个属性的值会随着对象的变化而变化
        【不同对象的这个属性具体的值不同】

    什么时候成员变量声明为静态变量
        所有对象都有这个属性，并且所有对象的这个属性的值是一样的，建议定为静态变量，节省内存的开销

    静态变量在类加载的时候初始化，内存在方法去中开辟，访问的时候不需要创建对象，直接使用“类名.静态变量名”的方式访问。
* */
public class Java22_StaticChinese {

    public static void main(String[] args){

        //创建中国人对象
        Chinese zhangsan1 = new Chinese();
        System.out.println(zhangsan1.id + zhangsan1.name + Chinese.country);

        Chinese zhangsan = new Chinese("1","zhangsan","中国");
        System.out.println(zhangsan.id + zhangsan.name + Chinese.country);

        Chinese lisi = new Chinese("2","lisi","中国");
        System.out.println(lisi.id + lisi.name + Chinese.country);

    }
}

class Chinese{

    //身份证号【每一个对象的身份证号不同】
    //实例变量
    String id;

    //姓名【每一个对象的姓名不同】
    //实例变量
    String name;

    //国籍【每一个对象由于都是由“Chinese类”实例化的】
    //实例对象存储在java对象内部，在堆内存当中
    //所有的中国人的国籍都是”中国“，这里声明为实例变量是浪费内存空间的
    //实例变量
    //String country;

    //静态变量，静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了
    //静态变量存储在方法区内存当中
    //国籍使用静态变量
    static String country = "中国";

    //构造函数（初始化）
    public Chinese(){
        this.id = null;
        this.name = null;
        //this.country = null;

    }

    public Chinese(String id, String name, String country){
        this.id = id;
        this.name = name;
        //this.country = country;
    }
}
package test;

/*
 *   封装课程130结束
 * */

/*
    用户类
    封装步骤：
        1、所有的属性私有化，使用private表示私有，修饰的所有数据只能在本类中访问

        2、对外提供简单的操作入口
            对外提供两个公开的方法，分别是set方法和get方法
            想修改age属性，用set方法
            想读取age属性，用get方法

        3、set方法的命名规范：
            public void set+属性名首字母大写（形参）{}
            public void setAge(int a){
                age = a;
            }

        4、get方法的命名规范：
            public int getAge(){
                return age;
            }
    背会一下内容
        setter and getter方法没有static关键字
        有static关键字修饰符的方法怎么调用：类.方法(实参)；
        没有static关键字修饰符的方法怎么调用：引用.方法(实参);
* */
class UserA{

    //年龄
    private int age;

    private int id;

    //set方法没有返回值，因为set方法只负责修改数据
    public void setAge(int a) {

        if (a < 0 || a >= 150){
            System.out.println("您输入的年龄不合法");
            return;
        }

        age = a;
    }

    public int setAge() {
        return age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int i) {
        id = i;
    }


    public int setId() {
        return id;
    }
}

/*测试类*/
public class Java19_Packaging01 {

    public static void main(String[] s){

        UserA user = new UserA();
        //读取年龄
        //对于编译报错，age属性私有化，在外部程序中不能直接访问
        //从此之后age属性非常安全
        //对于目前的程序来说，age属性彻底在外部无法访问
        //System.out.println(user.age);

        //修改
        user.setAge(100);
        user.setId(1);

        //读取
        System.out.println(user.setAge());
        System.out.println(user.setId());
    }
}

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
//测试类
public class Java19_Packaging01 {
    public static void main(String[] args){
        UserA user = new UserA();
        //修改
        System.out.println(user.getAge());

        user.setAge(160);
        //读取
        System.out.println(user.getAge());
    }
}

class UserA{
    //年龄
    int age;
    //set方法没有返回值，因为set方法只负责修改数据
    public void setAge(int age) {
        if (age < 0 || age >=150){
            System.out.println("输入的数值不合法");
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}



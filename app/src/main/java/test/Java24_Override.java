package test;
/*
    回顾java语言当中方法的重载【150完】
        overload
        方法重载当在同一个类当中，方法完成的功能是相似的，建议方法名相同
            ，这样方便程序员的编程
        什么条满足之后构成方法重载
            在同一个类当中
            方法名相同
            参数列表不同

    方法覆盖Override
        方法覆盖又被成为方法重写（override）

        什么时候使用方法重写？
            当父类中的方法已经无法满足当前子类的业务需求
            子类有必要将父类中继承过来的方法进行重写或者覆盖

        什么条件满足之后发生方法重写？【代码满足什么条件之后，就构成方法的覆盖呢？】
            *方法重写发生在具有继承关系的父子类之间
            *方法重写的时候返回值类型相同，方法名相同，形参列表相同
            *方法重写的时候访问权限不能更低，只能更高
            *方法重写的时候抛出异常不能更多可以更少

        建议方法重写的时候覆盖粘贴

        注意
            私有方法不能继承，所以不能覆盖
            构造方法不能继承，所以不能覆盖
            静态方法不存在覆盖
            覆盖只针对方法不含属性

* */
public class Java24_Override {
    public static void main(String[] args){
        //创建动物对象
        Animal animal = new Animal();
        animal.move();

        //创建猫科类
        Cat cat = new Cat();
        cat.move();

        //飞禽类
        Bird bird = new Bird();
        bird.move();
    }
}

//动物类
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

//猫科类
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
}

//鸟类
class Bird extends Animal{
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}

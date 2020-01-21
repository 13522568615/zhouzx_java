package test;
/*

    面向对象编程的核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，
        让各个对象之间协作起来形成一个系统。

    多态的作用：
        降低程序的耦合度，提高程序的扩展力
        能使用多态尽量使用多态

* */
public class Java25_Polymorphic01 {
    public static void main(String[] args){
        //创建一个主人对象
        Master zhangsan = new Master();
        //创建一个二哈对象
        Dog erHa = new Dog();
        zhangsan.feed(erHa);
        //创建一个猫对象
        Cat1 cat = new Cat1();
        zhangsan.feed(cat);
    }
}

/*
    Master主人类面向的是一个抽象的Pet，不在面向具体的宠物
* */
class Master {
    /*
    * 喂养方法
    * */
    public void feed(Pet pet) {
        pet.eat();
    }
}

/*
* 宠物类
* */
class Pet {
    /*
    * 宠物都可以吃东西
    * */
    public void eat(){
    }
}

/*
* 小狗类继承动物类
* */
class Dog extends Pet{
    public void eat(){
        System.out.println("小狗在吃东西");
    }
}

/*
* 蟒蛇类继承动物类
* */
class Cat1 extends Pet{
    public void eat(){
        System.out.println("小猫在吃东西");
    }
}






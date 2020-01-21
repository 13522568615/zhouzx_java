package test;

/*
    自行练习题解析：
        创建一个主方法
            引用主人对象
            动物园类引用猫对象（向上转型/自动转型）父类引用子对象


            主人通过要喂养的方法直接找到动物园类，因为猫和狗继承了动物园类
                ，因此在调用的时候能够直接通过动物园找到猫或者狗,不需要
                在通过猫找到猫，狗找到狗
                如：
                    主人.喂养（猫）;
                    主人.喂养（狗）;


        创建一个主人类
            创建一个喂养方法（动物园类命名 zoo）
                zoo.动物园

        创建一个动物园类
            创建一个动物园方法

        创建一个猫类继承动物园
            创建一个猫方法并且打印输出猫

        创建一个狗类继承动物园
            创建一个狗方法并且打印输出狗


* */

public class Java25_Polymorphic02 {
    public static void main(String[] args){
        ZhuRen zhuren = new ZhuRen();
        Zoo mao = new Mao();
        zhuren.weiYang(mao);

        Zoo zoo = new Gou();//父类型引用指向子类型对象，引用名zoo
        if (zoo instanceof Gou){//运算符判断对象类型，避免出现转型错误，
            Gou gou = (Gou)zoo;//向下转型/强制转型，将zoo类型强制转换成gou类型
            gou.dogMouse();
        }


    }
}

class ZhuRen{
    public void weiYang(Zoo zoo){
        zoo.Zoo();
    }
}

class Zoo{
    public void Zoo(){

    }
}

class Mao extends Zoo{
    public void Zoo(){
        System.out.println("猫宠物");
    }
}

class Gou extends Zoo {
    public void dogMouse(){
        System.out.println("狗抓老鼠");
    }
}
package test;
/*
    115集
* */
public class Java18_1OOTest03 {
    public static void main(String[] args){

        //创建一个丈夫对象
        Java18_Husband xiaohei = new Java18_Husband();
        xiaohei.name = "小黑";

        //创建一个妻子对象
        Java18_Wife xiaohong = new Java18_Wife();
        xiaohong.name = "小红";

        //通过丈夫找到妻子，也可以通过妻子找到丈夫
        xiaohei.w = xiaohong;
        xiaohong.h = xiaohei;

        //得到以上小黑的妻子名字
        System.out.println(xiaohei.w.name);
    }
}

class Java18_Husband {
    //姓名
    String name;

    //丈夫对象当中含有妻子引用
    Java18_Wife w;
}

class Java18_Wife {
    //姓名
    String name;

    //妻子对象当中含有丈夫引用
    Java18_Husband h;
}

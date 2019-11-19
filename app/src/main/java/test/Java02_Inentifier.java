package test;

/*1什么是标识符
  -在java原程序当中凡是程序员有权利自己命名的单词都是标识符
  -标识符可以表示什么元素
     -类名
     -方法名
     -变量名
     -常量名
     -接口名

* 2标识符的命名规则
    -不按照这个规则来，编辑器会报错
    -一个合法的标识符只能由数字、字母、下划线、美元符号组成
    -不能以数字开头
    -严格区分大小

* 3标识符的命名规范
  -不遵守规范，编译器不会报错
   -最好见名之意
   -遵守驼峰命名方式
    如：SystemService

   -类名、接口名：首字母大写，后面每个单词首字母大写
   -变量名、方法名：首字母小写、后面每个单词首字母大写
   -常量名：全部大写,如果有对个单词，用下划线隔开
*/


public class Java02_Inentifier {//类名，名字可修改

    //main是方法名
    public static void main(String[] args){//args是变量名
        System.out.println("三生三世");
    }
    public static void doSome(){//doSome方法名
        //i就是变量名
        int i = 10;
    }
}




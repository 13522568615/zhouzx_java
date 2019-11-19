package test;

/*  关于字面值
*       字面值：
*           -10/100
*           -"bac"
*           -3.14
*           -"a"
*           -true、false
*       字面值就是数据
*
*       数据在现实世界中是分门别类的，所以数据在计算机编程语言中也是有类型的
*           -10、100属于生疏型字面值
*           -3.14属于浮点数字面值
*           -true、false属于布尔值
*           -“abc”属于字符串行字面值
*           -“A”属于字符型字面值
*
*       java语言中所有的字符串型字面值必须使用双引号
*
*       java语言中所有的字符型字面值必须使用单引号
* */
public class Java03_ConstTest {
    public static void main(String[] args){
        System.out.println(100);

        System.out.println("ABC");

        System.out.println('A');

        System.out.println(3.14);

        System.out.println(true);

        System.out.println(false);
    }
}

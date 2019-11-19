package test;


/*
关于JAVA语言中的整数型
byte,int,long.short

*/

public class Java05_DateType_01 {
    public static void main(String[] agse) {
        long x = 100L;
        //强制转换,可能会损失精度
        int y = (int)x;
        System.out.println(y);

        long k = 2147483648L;
        int l = (int)k;
        System.out.println(l);

        int q = 1234;
        long v = q;
        System.out.println(v);

        //字面值可以不可以超过字节无法通过
        byte b = 127;
        //需要强制转换才能没有缺失精度
        byte n = (byte)128;
        System.out.println(n);

        /*
        * float[单精度]4字节
        * double[双精度]8字节
        * */

        double d = 3.3;
        float f = 5.1f;
        System.out.println(d);
        System.out.println(f);

        //关于boolean，占用1个字节
        //只有true和false
        boolean loginSuccess = false;
        if(loginSuccess){
            System.out.println("恭喜你，登录成功");
        }else{
            System.out.println("对不起，登录失败");
        }

        //关于基本数据类型之间的互相转换：
        /*转换规则
            除了boolean类型之外的7中类型都可以转换
            小容量转大容量，可以自动转换
            byte < short < int < long < float < double < char

            byte,short,char混合运算的时候，各自先转换成int类型在做运算
        * */


    }
}
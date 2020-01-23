package test;

/*
* 关系运算符
* 关系运算符的运算结果一定是布尔类型：true、false
*
*
* 逻辑运算符
* &逻辑与 （两边的算子都是true，结果就是true）
* |逻辑或
* ！逻辑非
* ^逻辑疑惑
*
* &&短路与
* ||短路或
*
*
* */
public class Java06_Operator01 {
    public static void main(String[] agse){
        System.out.println(5 > 3 & 5 > 2);
        System.out.println(5 > 3 & 5 > 6);
        System.out.println(5 > 3 | 5 > 2);
        System.out.println(5 > 3 ^ 5 > 6);
        System.out.println(5 > 3 ^ 5 > 2);


        int x = 10;
        int y = 8;
        System.out.println(x < y && ++x < y);
        System.out.println(x);


        //需要强制转换
        byte b = 10;
        b = (byte) (b + 5);
        System.out.println(b);

        //等于强制转换，等同于b = (byte) (b + 5);
        byte a = 10;
        a += 5;
        System.out.println(a);
        System.out.println("-----------------------------------");


        //字符串连接
        int q = 20;
        int w = 5;
        System.out.println(q + "+" + w + "=" + (q + w));

        int i = 10;
        String username = "zhangsan";
        System.out.println(i);
        System.out.println("登录成功，欢迎" + username + "回来！并且领取" + i + "积分！");

        System.out.println("-----------------------------------");
        //三元运算符
        //
        Boolean sex = false;
        char c = (sex ? '男' : '女');
        System.out.println(c);

    }
}


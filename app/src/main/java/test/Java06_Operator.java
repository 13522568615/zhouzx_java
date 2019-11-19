package test;



/*关于Java中运算符
* */
public class Java06_Operator {
    public static void main(String[] agse) {
        int i = 10;
        int j = 3;
        System.out.println( i + j );
        System.out.println( i - j );
        System.out.println( i * j );
        System.out.println( i / j );
        System.out.println( i % j );

        //关于++与运算符【自加1】
        int k = 10;
        //++运算符可以出现在变量后面
        k++;
        System.out.println(k);//11

        int y = 10;
        ++y;
        System.out.println(y);//11
        System.out.println("##########################");

        //规则：先做赋值运算，在对变量中保存的只进行自加1
        int a = 100;
        int b = a ++;
        System.out.println(a);
        System.out.println(b);

        //先进行自加1运算，然后在进行赋值操作
        int m = 20;
        int n = ++ m;
        System.out.println(m);
        System.out.println(n);

        //--o
        int o = 10;
        int p = --o;
        System.out.println(o);//9
        System.out.println(p);//9

        //q--
        int q = 10;
        int e = q --;
        System.out.println(q);//9
        System.out.println(e);//10
    }
}

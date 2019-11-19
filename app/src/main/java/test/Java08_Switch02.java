package test;
/*

    实现计算机当中+ - * \ %
    从键盘输入
    使用switch进行判断
    需要控制台输入3次
        第一个数字
        运算符
        第二个数字

    最终在控制台上是这样的一个场景
        欢迎使用简单计算器系统：
        请输入第一个数字：
        请输入运算符：
        请输入第二个数字：
        运算结果：
*/
public class Java08_Switch02 {
    public static void main(String[] agse){
        System.out.println("欢迎使用简单计算器系统");
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = s.nextInt();
        System.out.println("请输入运算符:");
        String operator = s.next();
        System.out.println("请输入第一个数字:");
        int num2 = s.nextInt();

        int result = 0;

        switch (operator){
            case "+" :
                result = num1 + num2;
            break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "%" :
                result = num1 % num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
        }
        System.out.println("运算结果：" + num1 + operator + num2 + "=" + result);
    }
}

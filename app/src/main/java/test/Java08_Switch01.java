package test;

public class Java08_Switch01 {
    public static void main(String[] agse){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入：（如：星期一）");

        //String类型可以
        String xingqi = s.next();
        switch (xingqi){
            case "星期一":
                System.out.println("1");
                break;
            case "星期二":
                System.out.println("2");
                break;
            default:
                System.out.println("输入有误");
        }


        //char类型也可以，等等
        System.out.println("请输入c");
        char c = 45;
        switch (c){
            case 45:
                System.out.println("正确");
            default:
                System.out.println("错误");
        }
    }
}

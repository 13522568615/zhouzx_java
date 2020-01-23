package test;

/*
 需求
   假设系统给定一个人的年龄，根据年龄来判断这个人处于生命的哪个阶段，年龄必须在0-150期间
        0-5     幼儿
        6-10    少儿
        11-18   青少年
        19-35   青年
        36-55   中年
        56-150  老年
* */
public class Java07_if01 {
    public static void main(String[] agse){
        //创建键盘扫描器对象
        java.util.Scanner a = new java.util.Scanner(System.in);
        //调用Scanner对象的next()方法开始接受用户键盘输入
        //当用户输入的时候，并且追中敲回车的时候，键入的信息自动赋值给userInputContent
        //接受文本
/*
        String userInputContent = a.next();
        System.out.println("您输入的年龄：" + userInputContent);
*/
        System.out.print("您输入的年龄：");//输入提示信息
        int age = a.nextInt();//等待用户输入，输入之后自动接受，赋值给age
        //System.out.print("age:" + age);

        //double a = 5;
        String str = "老年";
        if (age > 150 || age < 0){
            str = "对不起！您输入的不合法，输入的年龄应该在【0-150】之间";
        }else if(age > 54){
            str = "您的阶段处于：老年";
        }else if(age > 34){
            str = "您的阶段处于：中年";
        }else if(age > 17){
            str = "您的阶段处于：青年";
        }else if(age > 9){
            str = "您的阶段处于：少年";
        }else if(age > 5){
            str = "您的阶段处于：少儿";
        }else if(age >= 0){
            str = "您的阶段处于：幼儿";
        }
        System.out.println(str);
    }
}

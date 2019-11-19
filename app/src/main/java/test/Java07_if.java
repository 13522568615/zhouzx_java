package test;

/*
控制语句
    选择结构
        - if, if..else
        - switch

    循环结构
        - for
        - while
        - do..while

    控制循环的语句
        - break
        - continue


if语句属于选择结构
    if的语法结构：
        包含四种编写方式
        第一种
            if(){

            }
        第二种
            if(){

            }else(){

            }
        第三种
            if(){

            }else if(){

            }
        第四种
            if(){

            }else if(){

            }else if(){

            }else (){

            }


*/
public class Java07_if {
    public static void main(String[] agse) {
        double score = -150.5;
        String a = "不及格";
        if (score < 0 || score > 100) {
            a = "对不起您提供的数值不合法";
        }else if (score >= 90) {
            a = "优秀";
        }else if (score > 60){
            a = "及格";
        }
        System.out.println(a);

    }
}

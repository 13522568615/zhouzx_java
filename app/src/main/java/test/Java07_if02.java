package test;
/*
需求
    判断当前的天气：
        当外面下雨的时候：
            带雨伞：
                判断性别：
                    当性别为男：带一把大黑伞
                    当性别为女：带一把小花伞
        当外面是晴天的时候：
            判断天气的温度：
                当天气温度在30度以上：
                    当性别为男：带墨镜
                    当性别为女：擦防晒霜

     提示：
        用到嵌套
        天气的状况、温度、性别都需要从键盘输入
            天气状况：1表示下雨、0表示晴天
            温度用数字
            性别：1表示男，0表示女

*/
public class Java07_if02 {
    public static void main(String[] agse){
        java.util.Scanner s = new java.util.Scanner(System.in);

        //输入性别
        System.out.print("请输入性别：（1男/0女）");
        int sex = s.nextInt();

        //接受天气状况
        System.out.print("请输入当前天气：（1下雨/0晴天）：");
        int weather = s.nextInt();

        //判断天气状况
        if (weather == 1) {
            System.out.print("雨天");
            if(sex == 1) {
                System.out.print("带一把大黑伞");
            }else if (sex == 0) {
                System.out.print("带一把小花伞");
            }else {
                System.out.println("对不起您输入的性别有误");
            }
        } else if(weather == 0) {
            System.out.print("请输入温度：");
            int temp = s.nextInt();
            System.out.print("晴天");
            if(temp >= 30){
                if(sex == 1){
                    System.out.print("带墨镜");
                }else if(sex == 0){
                    System.out.print("擦防晒霜");
                }else{
                    System.out.println("对不起您输入的性别");
                }
            }
            } else{
            System.out.print("您输入的天气有误");
            }
        }
    }


package test;
/*
* */
public class Java09_For01 {
    public static void main(String[] agse){
        for(int i=1;i<=10;i+=2){
            System.out.println(i);//奇数
        }
        for(int i=0;i<10;i+=2){
            System.out.println(i);//偶数
        }
        for(int i=0;i<10;i-=2){
            System.out.println(i);
        }
        for(int i=0;i<10;) {
            System.out.println(i);
            i++;
        }
    }
}

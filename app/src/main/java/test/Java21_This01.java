package test;

public class Java21_This01 {

    int num = 10;

    public static void main(String[] args){

        Java21_This01 t1 = new Java21_This01();
        System.out.println(t1.num);

        t1.doSome();

        t1.run();
    }

    public void doSome(){
        System.out.println("dosome");
    }

    public void run(){
        doSome();
    }
}

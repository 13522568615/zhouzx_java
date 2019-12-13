package test;
/*
    运用方法重载，封装System.out.println();

* */
public class U{
    public static void pl(byte b){
        System.out.println(b);
    }

    public static void pl(short b){
        System.out.println(b);
    }

    public static void pl(int b){
        System.out.println(b);
    }

    public static void pl(long b){
        System.out.println(b);
    }

    public static void pl(float b){ System.out.println(b); }

    public static void pl(double b){
        System.out.println(b);
    }

    public static void pl(boolean b){
        System.out.println(b);
    }

    public static void pl(char b){
        System.out.println(b);
    }

    public static void pl(String b){
        System.out.println(b);
    }
}

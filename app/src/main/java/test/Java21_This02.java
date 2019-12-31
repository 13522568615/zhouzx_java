package test;
/*
    141-144集
* */
public class Java21_This02 {
    public static void main(String[] args){

        Date date = new Date();

        //构造函数，初始化年月日
        System.out.println(date.getYear()+ "年"
                + date.getMonth() + "月" + date.getDay() +"日");

        date.setDay(12);
        date.setYear(1994);
        date.setMonth(2);

        //输出修改的年月日
        System.out.println(date.getYear()+ "年"
                + date.getMonth() + "月" + date.getDay() +"日");
    }
}

class Date{

    //属性
    private int year;
    private int month;
    private int day;

    //构造方法，起到初始化作用
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //运用this初始化赋值
    public Date(){
        this(2000,01,01);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
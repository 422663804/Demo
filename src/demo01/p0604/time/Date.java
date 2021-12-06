package demo01.p0604.time;

public class Date {
    public int year;
    public int month;
    public int day;

    public void showDate() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.year = 2021;
        date.month = 6;
        date.day = 4;
        date.showDate();
    }
}
//1. 写一个简单的日期类，类中有属性：年，月，日。类中有方法：描述日期，
//        该方法输出该对象的日期格式“XXXX年XX月XX日“
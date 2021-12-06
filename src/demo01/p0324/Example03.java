package demo01.p0324;

public class Example03 {
    public static void main(String[] args) {
        int i = 768000;
        int day = 768000/3600/24;
        int month = (i-(60*60*24*day))/3600;;
        int minute =(i-(60*60*24*day)-3600*month)/60;
        int second = (i-(60*60*24*day)-3600*month)-60*minute;
        System.out.println(day+"天"+month+"小时"+minute+"分"+second+"秒");
    }
}
/*
3. 时间为：768000秒，换算为天：时：分：秒的形式*/

package demo01.p0407;
//5. 输出1900-2012的闰年 (cn.bing.com)

public class Example05 {
    public static void main(String[] args) {
//        int year = 1900;
        /*while (year <= 2012) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print(" " + year);
            } else if (year % 400 == 0) {
                System.out.print(" " + year);
            }
            year++;
        }*/
        for (int year=1900;year<=2012;year++){
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print(" " + year);
            } else if (year % 400 == 0) {
                System.out.print(" " + year);
            }
        }
    }
}

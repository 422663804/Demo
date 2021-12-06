package demo01.p0407;
//6. 计算1900-2012年的所有天数

public class Example06 {
    public static void main(String[] args) {
        int sum = 0;
        int year = 1900;
        while (year <= 2012) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                sum = sum + 366;
            } else {
                sum = sum + 365;
            }
            year++;
        }
     /*   for (int year = 1900; year <= 2012; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                sum = sum + 366;
            } else {
                sum = sum + 365;
            }
        }*/
        System.out.print("1900到2012年共有" + sum + "天");
    }
}

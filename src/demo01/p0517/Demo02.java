package demo01.p0517;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int num = scanner.nextInt();
        int day = num / 3600 / 24;
        int hour = (num - (3600 * 24 * day)) / 3600;
        int minute = (num - (3600 * 24 * day) - 3600 * hour) /  60;
        int second = (num - (3600 * 24 * day) - 3600 * hour) - 60 * minute;
        System.out.println("小时=" + hour + " 分钟=" + minute + " 秒=" + second);
    }
}
//2.	输入一个数字表示时间，单位为秒，换算成小时、分钟、秒的格式。
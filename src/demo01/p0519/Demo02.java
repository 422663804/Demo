package demo01.p0519;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = input.nextInt();
        System.out.print("请输入月份:");
        int month = input.nextInt();
        boolean result = true; //判断闰年还是平年
        for (int i = 1900; i <= 2200; i++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                result = true;
            } else {
                result = false;
            }
        }
        switch (month) {
            case 2:
                if (result) {
                    System.out.println("该月份天数为29天");
                } else {
                    System.out.println("该月份天数为28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该月份天数为30天");
                break;
            default:
                System.out.println("该月份天数为31天");
                break;
        }
    }
}
//2.	查询某年某月的天数，年份和月份从控制台输入。
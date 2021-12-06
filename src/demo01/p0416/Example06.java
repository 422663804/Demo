package demo01.p0416;

import java.util.Scanner;
public class Example06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = scanner.nextInt();
        System.out.print("请输入月份:");
        int month;
        month = scanner.nextInt();
        int days = 0;
        for (int i = 1900; i < 2100; i++) {         //判断年份
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }

        for (int i = 1; i < month; i++) {        //判断月份的天数
            switch (i) {
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                default:
                    days += 31;
                    break;
            }
        }
        days += 1;      //1号
        int weekofrist = days % 7;
        System.out.println(year + "年" + month + "月1号是星期" + weekofrist);

        //打印头部
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日\t");

        int daysInmouth;
        switch (month) {        //当前月份天数
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInmouth = 29;
                } else {
                    daysInmouth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmouth = 30;
                break;
            default:
                daysInmouth = 31;
                break;
        }

        for (int i = 1; i <= weekofrist - 1; i++) {
            System.out.print("\t\t");
        }
        for (int i = 1; i <= daysInmouth; i++) {  //打印天数
            System.out.print(i + "\t\t");
            if ((i + weekofrist - 1) % 7 == 0) {
                System.out.print("\n");
            }
        }
    }
}

/*
6. 独立完成万年历！
1、判断输入的年份是平年还是闰年
2、平年则输出平年的月份 闰年则输出闰年的月份
*/

package demo01.p0416;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        int days = 0; //天数
        //判断年份是平年还是闰年
        for (int i = 1900; i < 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        //判断输入的月份是闰年还是平年的月份
        for (int i = 1; i < month; i++) {
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
        //判断每个月的1号是星期几
        days += 1;
        int weekdayfrist = days % 7;
        System.out.println(year + "年" + month + "月1号是星期" + weekdayfrist);

        //打印表头
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日\t");
        //打印每个月的有多少天
        int daymonth;
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daymonth = 29;
                } else {
                    daymonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daymonth = 30;
                break;
            default:
                daymonth = 31;
                break;
        }
        for (int i = 1; i <= weekdayfrist - 1; i++) {
            System.out.print("\t\t");
        }
        for (int i = 1; i <= daymonth; i++) {
            System.out.print(i + "\t\t");
            if ((i + weekdayfrist - 1) % 7 == 0) { //判断一号前空格多少天
                System.out.print("\n");
            }
        }









        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= i; k++) {
                System.out.print(k);
            }
            for (int z = i-1;z>=1;z--){
                System.out.print(z);
            }
            System.out.println();
        }*/
       /* for (int i = 1; i <= 100; i++) { //鸡多少只
            for (int j = 1; j <= 100; j++) {  //多少元
                int z = 100 - j;

            }
        }*/
    }
}

/*6. 独立完成万年历！
        1、判断输入的年份是平年还是闰年
        2、平年则输出平年的月份 闰年则输出闰年的月份
        */
   /*   打印如下形状:
           1
          12 1
         123 21
        1234 321
       12345 4321*/
/*百元买百鸡问题:公鸡每只5元，母鸡每只3元，小鸡每3只1元。一百元买一百只鸡，要求三种鸡都要买，有多少种购买组合?
        穷举法
        */
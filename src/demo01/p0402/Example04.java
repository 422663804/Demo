package demo01.p0402;
//输入月份，输出该月份下的天数，如果月份输入错误，则输出0。（尝试使用hasNextInt方法）

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        new funtion().show();
    }
}

class funtion {
    public void show() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("请输入月份：（1-12）");
        if (scanner4.hasNextInt()) {
            int month = scanner4.nextInt();
            if (month >= 1 && month <= 12) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("该月份天数为31天");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("该月份天数为30天");
                        break;
                    case 2:
                        System.out.println("该月份天数为28天");
                        break;
                }
            } else {
                System.out.println("月份输入错误:0");
            }
        } else {
            System.out.println("月份输入错误:0");
        }
    }
}
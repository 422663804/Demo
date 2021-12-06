package demo01.p0416;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "位学生成绩:");
            for (int j = 1; j <= 1; j++) {
                System.out.print("语文成绩=");
                double Chinese = sc1.nextDouble();
                System.out.print("数学成绩=");
                double mathematics = sc1.nextDouble();
                System.out.print("英语成绩=");
                double English = sc1.nextDouble();
                if (Chinese < 0 || mathematics < 0 || English < 0) {
                    System.out.println("该学生总分置零");
                    break;
                } else {
                    sum = Chinese + mathematics + English;
                    System.out.println("第" + i + "位学生成绩为" + sum);
                }
            }
        }
    }
}

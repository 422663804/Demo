package demo01.p0416;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "位学生成绩:");
            for (int j = 1; j <= 3; j++) {
                System.out.print("请输入第" + j + "门成绩:");
                double score = sc2.nextDouble();
                if (score < 0) {
                    continue;
                }
                sum += score;
            }
        }
        System.out.println("5名学生的总分数为" + sum);
    }
}
/*
continue计算某班5名学生的总分数（分数从控制台输入），每名学生3门学科，异常分数（负数）不计入总分，其他成绩正常记录到总分。
1、跳过该分数，录入正常分数？怎么跳，怎么录入
2、
*/

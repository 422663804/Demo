package array;

import java.util.Scanner;

public class Example0913 {
    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        int[] array = new int[3];
        int average = 0;
        int sum = 0;
        for (int i = 1; i <= array.length; i++) {
            System.out.print("请输入第" + i + "门成绩：");
            double score = scanner01.nextDouble();
            sum += score;
        }
        average = sum / array.length;
        System.out.print("sum=" + sum + "\t\taverage=" + average);
    }
}
//1. 定义一个长度为3的整数数组表示3门成绩，从控制台录入成绩，计算总分和平均分
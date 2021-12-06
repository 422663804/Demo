package demo01.p0531;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的成绩:");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
//某班上有10名学生，每名学生有3次考试成绩，请使用二维数组接收控制台输入的学生成绩，并统计出该班的总成绩。
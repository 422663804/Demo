package demo01.p0409;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("请输入一位整数：");
        int i = scanner2.nextInt();
        int sum = 0;
        while (i != 0) {
            sum += i;
            System.out.print("继续输入：");
            i = scanner2.nextInt();
        }
        System.out.println("sum=" + sum);
    }
}
/*
3.从控制台输入数字，每次累加，直到输入数字为0结束输入和累加计算，输出结果

*/

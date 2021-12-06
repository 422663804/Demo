package demo01.p0409;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一位整数：");
        int n = sc.nextInt();
        int a = (int) Math.sqrt(n);
        int j = a * a;
        if (n == j) {
            System.out.println("419904是平方数，是" + a + "的平方");
        } else {
            System.out.println(n + "不是平方数");
        }
    }
}
/*
8.请问419904是平方数吗？用程序验证一下（平方数即该数字n=a*a，比如9是3的平方，16是4的平方）。

*/

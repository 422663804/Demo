package demo01.p0514.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第1位正整数n:");
        int n = scanner.nextInt();
        System.out.print("请输入第2位正整数m:");
        int m = scanner.nextInt();
        int count = 0;
        if (n < m) {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        } else {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("偶数count=" + count);
    }
}
//1. 输入两个正整数n、m，输出这两个正整数之间有多少个偶数。
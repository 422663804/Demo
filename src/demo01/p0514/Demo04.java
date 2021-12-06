package demo01.p0514;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位数字:");
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(n).append("x");
            n--;
        }
        String substring = result.substring(0, result.length() - 1);
        System.out.println(substring);
    }
}
//编写代码实现：输入一个数字，输出其阶乘表达式。
//阶乘的定义为：n!=nx(n-1)x(n-2)…x2x1，比如输入5，应该输出5!=5x4x3x2x1；再比如输入100，应该输出100!=100x99x98x…x2x1。
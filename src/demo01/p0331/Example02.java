package demo01.p0331;
//从控制台输入一个数字和一个字符串（当做密码）作为系统登录指标，如果这个数字被3整除，并且密码为"abc123"则输出“登录成功”，否则输出“登录失败”。

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字:");
        int a = scanner.nextInt();
        System.out.print("请输入密码:");
        String i = scanner.next();
        if ("abc123".equals(i) && a % 3 == 0) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }
    }
}

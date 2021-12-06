package demo01.p0326;

import java.util.Scanner;

//1. 从控制台输入一个整数 a，输出 a 是否在 1到100之间（结果为布尔类型）
public class Example01 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i>0&&i<=100);
    }
}

package demo01.p0514.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count++;
            }
        }
        System.out.println("count=" + count);
    }
}
// 有一个字符串“ab12cd34ef56”，通过程序计算该字符串中含有多少个数字？
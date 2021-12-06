package demo01.p0604;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 'A' && num <= 'Z') {
            char c = (char) num;
            System.out.println("c=" + c);
        } else {
            System.out.println("非有效的大写字母数字！");
        }
    }
}
//1. 从控制台输入一个整数，并转化为大写字母字符输出，不在字母范围内则输出“非有效的大写字母数字！”

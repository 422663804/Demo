package demo01.p0528;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        for (char c : array) {
            if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e') {
                System.out.println("字符串是有a/b/c/d/e中的一个，该字符为" + c);
            }
        }
    }
}
//2.	输入一个字符串，使用switch语句判断该字符串是否为a/b/c/d/e中的某一个，并输出。

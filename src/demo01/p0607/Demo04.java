package demo01.p0607;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = scanner.next();
        System.out.print("请输入一个数字:");
        String num = scanner.nextInt() + "";
        int address = str.indexOf(num);
        System.out.println("地址为:" + address);
    }
}
//输入一个字符串，输入一个数字，输出该数字在字符串中的地址。
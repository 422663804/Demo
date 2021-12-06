package demo01.p0528;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入会员号:");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < 999 || num > 9999 || num % 10 != 0) {
                System.out.println("您输入的会员号有误");
            } else {
                System.out.println("会员号正确，登录成功!");
            }
        } else {
            System.out.println("您输入的会员号有误!");
        }
    }
}
//1.	利用扫描器输入合理的会员号：必须是数字，且为4位数，必须为10的倍数！
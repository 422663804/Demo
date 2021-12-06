package demo01.p0528;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(10);
        System.out.print("请输入你的会员号：");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int numTen = num / 10 % 10;
            if (numTen == ran) {
                System.out.println("幸运会员");
            } else {
                System.out.println("false");
            }
        }
    }
}
//输入一个整数会员号，如果这个而会员号的十位和随机数相等则为幸运会员，否则不是。

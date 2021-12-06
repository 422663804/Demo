package demo01.p0326;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int i = scanner2.nextInt();
        if (i % 2 == 0) {
            System.out.println("您输入的是偶数\t" + i);
        } else {
            System.out.println("您输入的是奇数\t" + i);
        }
    }
}
//2. 从控制台输入一个数，判断是否是奇数并输出？(对2求余不为0)
package demo01.p0331;
/*输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再判断这三个数之和是否大于1000，
        如果大于1000输出“这三个数之和大于1000”否则输出“这三个数之和不大于1000*/

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("请输入第1个数:");
        int i = scanner5.nextInt();
        System.out.print("请输入第2个数:");
        int j = scanner5.nextInt();
        System.out.print("请输入第3个数:");
        int k = scanner5.nextInt();
        if (i == j && j == k) {
            System.out.println("这三个数相等");
        } else if ((i + j + k) > 1000) {
            System.out.println("这三个数之和大于1000");
        } else {
            System.out.println("这三个数之和不大于1000");
        }
    }
}

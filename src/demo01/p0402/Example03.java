package demo01.p0402;
// 输入4个数字，最后输出最小的数字。

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("请输入第1位数:");
        double a = scanner3.nextDouble();
        System.out.print("请输入第2位数:");
        double b = scanner3.nextDouble();
        System.out.print("请输入第3位数:");
        double c = scanner3.nextDouble();
        System.out.print("请输入第4位数:");
        double d = scanner3.nextDouble();
        double min = a; //假设最小数为第一位数，然后对下面三位数进行对第一位数进行比较
        if (min > b) {
            min = b;
            if (min > c) {
                min = c;
                if (min > d) {
                    min = d;
                }
            }
        }
        System.out.println("最小值为" + min);
    }
}


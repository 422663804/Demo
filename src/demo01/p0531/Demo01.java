package demo01.p0531;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个小数");
        double num1 = scanner.nextDouble();
        System.out.print("请输入第二个小数");
        double num2 = scanner.nextDouble();
        int num3 = (int) (num1 / num2);
        double num = num1 - num2 * num3;
        System.out.println("余数num3=" + num);
    }
}
//1.	从控制台输入一个小数作为除数，输入另一个小数作为被除数，求其余（不使用%操作符）
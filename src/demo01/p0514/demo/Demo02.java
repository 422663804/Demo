package demo01.p0514.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三位数:");
        int num = scanner.nextInt();
        if (num > 100 && num < 1000) {
            int index1 = num % 10;
            int index2 = num / 10 % 10;
            int index3 = num / 100 % 10;
            System.out.println(index1 + "" + index2 + "" + index3);
        } else {
            System.out.println("您输入的有误!");
        }
    }
}
//输入一个三位数，将其各个位数的数字反过来组成一个新数，输出该数字。比如输入234，输出432.
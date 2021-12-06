package demo01.p0329;

import java.util.Scanner;
//1. 从控制台输入一个数，打印该数字的奇偶性（即奇数打印改数字为奇数，偶数打印该数字为偶数）。
public class Example04 {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输入一位整数");
        int i = scanner4.nextInt();
        if (i%2==0){
            System.out.println("该数字为偶数");
        }else {
            System.out.println("该数字为奇数");
        }
    }
}

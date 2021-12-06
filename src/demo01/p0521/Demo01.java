package demo01.p0521;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int num = scanner.nextInt();
        int one = num % 10;
        if (num ==one*one){
            System.out.println(num+"是同构数");
        }else {
            System.out.println(num+"不是同构数");
        }
    }
}
//1. 输入一个二位整数，判断这个数字是否是同构数。
//        同构数：某平方数的平方根出现在它的右边的数，nxn=mn类型。比如6x6=36,5x5=25

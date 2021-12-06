package variable;

import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {
        Scanner scanner22 = new Scanner(System.in);
        System.out.print("请输入一个二位整数：");
        int i = scanner22.nextInt();
        int j = i%10;
        if (j*j==i){
            System.out.println("该数为同构数"+i);
        }else {
            System.out.println("该数不是同构数");
        }

    }
}
/*
1. 输入一个二位整数，判断这个数字是否是同构数。
        同构数：某平方数的平方根出现在它的右边的数，nxn=mn类型。比如6x6=36,5x5=25*/

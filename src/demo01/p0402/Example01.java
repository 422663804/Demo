package demo01.p0402;
//输入一个整数，如果等于0，把这个整数加2的结果输出；如果等于1,把这个整数加3的结果输出;如果等于2,把这个整数加4的结果输出;如果是其他的数就直接输出这个整数。

import java.util.Scanner;
public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int i = scanner.nextInt();
        if (i==0){
            System.out.println("结果为"+(i+2));
        }else if(i==1){
            System.out.println("结果为"+(i+3));
        }else if(i==2){
            System.out.println("结果为"+(i+4));
        }else {
            System.out.println(i);
        }
    }
}

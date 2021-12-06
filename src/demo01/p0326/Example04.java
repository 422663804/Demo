package demo01.p0326;

import java.util.Scanner;

//4. 从控制台输入一个整数，判断该数是否为4位数？
public class Example04 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        int i = scanner3.nextInt();
        if (i>999&&i<=9999){
            System.out.println("您输入的是四位数");
        }else {
            System.out.println("您输入的不是四位数");
        }

    }
}

package demo01.p0329;

import java.util.Scanner;
//从控制台输入一个数，如果这个数字为100以内的正数且能被5整除则输出“遇上了对的人”否则输出“没确认过眼神”

public class Example02 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入一位正整数");
        int i = scanner2.nextInt();
        if (i<100&&i%5==0){
            System.out.println("遇上了对的人");
        }else {
            System.out.println("没确认过眼神");
        }
    }
}

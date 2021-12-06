package demo01.p0326;

import java.util.Scanner;

//5. 从控制台输入一个整数，判断该数是否为条件数？（条件数：该数字能被5整除或者十位数为5即为条件数。）
public class Example05 {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);
        int i = scanner4.nextInt();
        if (i%5==0||i/10%10==5){
            System.out.println("您输入的是条件数");
        }else {
            System.out.println("您输入的不是条件数");
        }

    }
}

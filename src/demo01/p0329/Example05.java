package demo01.p0329;


//5. 输入一个数字作为会员号，如果该会员号符合要求则输出“合法的会员号”，否则输出“该会员号不存在！请检查后重新输入！”，
// 会员号条件：该数字是四位数，且各个位数之和能被3整除。

import java.util.Scanner;
public class Example05 {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("请输入会员号");
        int i = scanner5.nextInt();
        int a=i%10;
        int b=i/10%10;
        int c=i/100%10;
        int d=i/1000%10;
        int sum=a+b+c+d;
        if (i>999&&i<9999&&sum%3==0){
            System.out.println("合法的会员号");
        }else {
            System.out.println("该会员号不存在！请检查后重新输入！");
        }
    }
}

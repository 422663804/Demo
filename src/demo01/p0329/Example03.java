package demo01.p0329;

//从控制台输入一个数字和一个字符串(当做密码)作为系统登录指标，如果这个数字被3整除，并且密码为" abc123"则输出“登录成功”，否则输出“登录失败”。

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        String psw = "abc123";
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = scanner3.nextInt();
        System.out.println("请输入密码");
        String password = scanner3.next();
        if (i%3==0&&password.equals(psw)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
     /*   int password = scanner3.nextInt();
        if (i%3==0&&password==123456){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }*/
    }
}

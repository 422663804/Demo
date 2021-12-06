package demo01.p0510;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = input.next();
        System.out.print("请输入密码:");
        String password = input.next();
        if (username.length() >= 6 && username.length() <= 10 && password.length() > 10) {
            System.out.println("账号密码格式正确");
        } else {
            System.out.println("账号密码格式有误");
        }
    }
}
//1. 注册某网站的用户，输入一个字符串a作为用户名，另一个字符串b作为密码，判断注册用户名和密码是否符合要求：用户名长度在6-10范围内，密码长度不能小于10。


package demo01.p0510;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = input.next();
        System.out.print("请输入密码:");
        String password = input.next();
        if (username.equalsIgnoreCase("userJAVA") && password.equalsIgnoreCase("userJAVA")) {
            System.out.println("账号密码正确");
        } else {
            System.out.println("账号密码有误");
        }
    }
}
//2. 输入一个用户名和一个密码登录某网站，判断这个用户名与密码是否都等于“userJAVA”，不区分大小写。
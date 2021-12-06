package demo01.p0329;
/*从控制台输入一个用户名和一个密码进行登录，只有账号为admin密码为88888才能正常登陆，并打印“登陆成\功”，
否则输出登陆不成功的原因:用户名不对输出“用户名错误!登录失败!“，用户名正确但是密码错误则输出“密码错误!登录失败!”。*/

import java.util.Scanner;
public class Example06 {
    public static void main(String[] args) {
        String name = "admin";
        String psw = "888888";
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("请输入账号");
        String userName = scanner6.next();
        System.out.print("请输入密码");
        String password = scanner6.next();
        if (userName.equals(name)&&password.equals(psw)){
            System.out.println("登录成功");
        }else if (!(userName.equals(name))&&password.equals(psw)){
            System.out.println("用户名错误!登录失败!");
        }else if(userName.equals(name)&&!(password.equals(psw))){
            System.out.println("密码错误!登录失败!");
        }else {
            System.out.println("您输入的账号密码有误，请确认后再从新输入！");
        }
    }
}

package demo01.p0521;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = scanner.next();
        if (username.length() > 10 || (username.charAt(0) >= 48 && username.charAt(0) <= 57)) {
            System.out.println("用户名不合理");
        } else {
            System.out.println("用户名合理");
        }
    }
}
//某网站注册用户名要求如下：长度不能超过10个，第一个字符不能为数字。
//        请从控制台输入一个字符串作为用户名，判断该用户名是否合理。

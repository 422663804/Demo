package demo01.p0510;

import java.util.Scanner;

public class InputID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的身份证:");
        String id = input.next();
        if (id.length() == 18) {
            System.out.println("身份证位数正确");
            String b = id.substring(6, 14);
            System.out.println("出生日期:" + b);
        } else {
            System.out.println("您输入的身份证有误，请从新输入!");
        }
    }
}
//3. 输入你的身份证，输出你的生日（身份证长度都是18位，类似：430100201810190000）。
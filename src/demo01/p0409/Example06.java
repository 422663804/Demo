package demo01.p0409;


import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        String str = "";
        System.out.print("请输入字符：");
        String i = scanner3.next();
        while (!i.equals("Esc")) {
            str += i;
            System.out.print("请再次输入:");
            i = scanner3.next();
        }
        System.out.println("输入字符串为" + str);
    }
}

//6.循环输入字符串，直到“Esc”为止，停止输入，输出所有字符串拼接的结果。

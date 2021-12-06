package demo01.p0517;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"刘A", "赵B", "许C", "王D", "赵E", "刘F", "李G", "赵H", "孙I", "唐J"};
        System.out.print("请输入你要查找学生姓:");
        String name = input.next();
        for (String value : array) {
            String s = value.substring(0, 1);
            if (name.equals(s)) {
                System.out.println(value);
            }
        }
    }
}
//某教室所有同学的名字为【刘A，赵B，许C，王D，赵E，刘F，李G，赵H，孙I，唐J】，从控制台输入一个姓，找出所有该姓的学生。
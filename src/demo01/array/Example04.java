package demo01.array;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //扫描器，从控制台输入班级学生的人数。
        System.out.print("请输入班级学生的人数：");
        int num = scanner.nextInt();
        String[] array = new String[num];
        StringBuilder str = new StringBuilder(); //调用StringBuilder类里面的append()方法，进行对输入的字符拼接
        for (int i = 1; i <= array.length; i++) {
            System.out.print("请输入第" + i + "位学生的姓名：");
            String name = scanner.next();
            str.append(name);
        }
        System.out.println(str);
    }
}
/*
从控制台输入一个数字表示某个班学生人数，然后创建一个表示该班级所有学生名字的字符串数组，
并使用控制台输入学生名字赋值给数组的每一个元素，最后输出所有学生姓名
分析：
1、控制台输入一个数字 将这个数值定义为数组的范围
2、
*/

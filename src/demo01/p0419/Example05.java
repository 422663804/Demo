package demo01.p0419;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //扫描器，从控制台输入班级学生的人数。
        System.out.print("请输入班级学生的人数：");
        int num = scanner.nextInt();
        String[] array = new String[num];
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的姓名：");
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
5. 从控制台输入一个数字表示某个班学生人数，然后创建一个表示该班级所有学生名字的字符串数组，并使用控制台输入学生名字赋值给数组的每一个元素，最后输出所有学生姓名。
1、控制台输入一个数字表示某个班学生人数，即用到扫描器输入整数。
2、创建一个字符串数组用来储存姓名，数组长度为扫描器输入的整数。
3、控制台输入学生名字赋值给数组的每一个元素，则说明需要遍历数组，用循环语句进行遍历数组。
4、输出学生姓名，则需要用字符串拼接来实现姓名的拼接。
*/

package demo01.p0421;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入姓名:");
            array[i] = scanner.next();
        }
        System.out.println("输入后的数组:" + Arrays.toString(array));
        System.out.print("请录入需要查找的姓名:");
        String name = scanner.next();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                flag = false;
                System.out.println("有这个人的姓名,其数组下标为:"+i);
                System.out.print("请录入新姓名:");
                name = scanner.next();
                array[i] = name;
            }
        }
        if (flag) {
            System.out.println("没有该姓名");
        }
        System.out.println("数组为:" + Arrays.toString(array));
    }
}
/*
5.定义一个长度为5的字符串数组。循环输入5个姓名。然后再输入一个用户的姓名，
  检查数组中是否有这个人的姓名，并输出所在下标，然后修改该姓名为一个新的名字,这个名字由控制台输入，最后打印所有姓名。
  思路：
  1、for循环输入姓名
  2、判断（字符串比较） 遍历数组找到该数组的下标
  3、打印数组
  */

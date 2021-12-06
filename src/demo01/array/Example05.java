package demo01.array;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner sc2 = new Scanner(System.in);
        System.out.print("请输入一位整数：");
        int input = sc2.nextInt();
        boolean flag = false;
        for (int j = 0; j <= array.length-1; j++) {
            if (input == array[j]) {
                flag = true;
            }
        }
        if (flag){
            System.out.println("输入的数字" + input + "存在于数组中");
        }else {
            System.out.println("输入的数字:" + input + "不存在数组中");
        }
    }
}
/*
已知数组：{1,2,3,4,5,6,7,8,9,0}，编写编程实现猜数字：输入一个数字，输出该数字是否存在于该数组中？
分析
1、控制台输入
2、输入的数字与数组中的元素比较 //循环遍历
*/

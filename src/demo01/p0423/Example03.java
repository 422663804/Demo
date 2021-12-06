package demo01.p0423;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入行数：");
        int k = scanner.nextInt();
        System.out.print("请输入列数：");
        int z = scanner.nextInt();
        int[][] array = new int[k][z];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
3.  创建一个二维数组，行数和列数从控制台输入，
    每一个元素的值等于它所在的行下标和列下标之和：（i+j），
    最后输出每一个元素，
        要求每一行元素输出到一行，元素之间互相添加空格或者`\t`制表符。*/

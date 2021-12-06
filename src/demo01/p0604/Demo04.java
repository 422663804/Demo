package demo01.p0604;

import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int num = scanner.nextInt();
        int[][] array = new int[5][5];
        boolean result = false;
        int index01 = 0;
        int index02 = 0;
//        赋值
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
//        查找
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == num) {
                    result = true;
                    index01 = i;
                    index02 = j;
                }
            }
        }
        if (result) {
            System.out.println("行=" + index01 + " 列=" + index02);
        } else {
            System.out.println("数组中没有该元素");
        }
    }
}
//1. 创建一个二维整数数组，5行5列，每个元素使用随机数生成，
//        从控制台输入一个整数，查询该整数是否在此二维数组中，在就输出行和列下标。
package demo01.p0602;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("请输入数组的长度:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(array));
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("min=" + min);
    }
}
//1. 创建一个数组，数组长度由控制台输入，数组的每一个元素随机生成（范围-10到10之间），
//        最后输出该数组的最小值
package demo01.p0607;

import java.util.Random;
import java.util.Scanner;


public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(5);
        int[] array = new int[5];
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入数组第" + (i + 1) + "位元素:");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                System.out.println("随机数存在数组中，随机数为" + num);
                result = false;
            }
        }
        if (result) {
            System.out.println("随机数不存在数组中，随机数为" + num);
        }
    }
}
//1. 从控制台输入一个长度为5的整数数组，随机生成一个数字，判断你该数字是否在该输入的数组中。
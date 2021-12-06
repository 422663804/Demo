package demo01.p0421;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scanner06 = new Scanner(System.in);
        System.out.print("请输入一位整数num：");
        int num = scanner06.nextInt();
        if (num < 0) {
            System.out.println("输入有误,程序结束!");
            System.exit(0);
        } else {
            boolean flag = true;
            Random random = new Random();
            int rand = random.nextInt(10) + 1;
            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                System.out.print("请输入一位整数:");
                array[i] = scanner06.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == rand) {
                    flag = false;
                    System.out.println("该随机数是数组的一个元素,随机数为" + rand);
                    System.out.println("数组为" + Arrays.toString(array));
                    break;
                }
            }
            if (flag) {
                System.out.println("数组为" + Arrays.toString(array));
                System.out.println("数组中未找到与该随机数相等的元素,随机数是" + rand);
            }
        }
    }
}
/*6.从控制台输入一个整数num， 如果数字num小于0则输出“输入有误,程序结束!”否则创建一个长度为num的整数数组sz,
数组sz的每一个元素从控制台输入，然后随机生成一个数字rand,最后检查rand是否是sz的一个元素,
是就输出:“该随机数是数组的一个元素”，否就输出“数组中未找到与该随机数相等的元素”*/

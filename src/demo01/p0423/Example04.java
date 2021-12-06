package demo01.p0423;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner scanner02 = new Scanner(System.in);
        Random random = new Random();
        System.out.print("请输入数组的长度：");
        int length = scanner02.nextInt();
        int[] array = new int[length];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("数组为" + Arrays.toString(array));
        System.out.println("min=" + min);
    }
}
//4. 创建一个数组，数组长度由控制台输入，数组的每一个元素随机生成（范围-10到10之间），最后输出该数组的最小值。
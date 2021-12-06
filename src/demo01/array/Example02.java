package demo01.array;

import java.util.Arrays;
import java.util.Random;

public class Example02 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random01 = new Random();
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = random01.nextInt(100) + 1;
        }
        System.out.println("" + Arrays.toString(array));
    }
}

/*
定义一个整数数组，长度为15，每个元素的值为随机数，最后打印出数组的每一个元素
分析：
1、动态数组 长度为15
2、数组的遍历
*/

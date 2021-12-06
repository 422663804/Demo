package demo01.p0517;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (i + 1) + (i + 2);
        }
        System.out.print(Arrays.toString(array));
    }
}
//3.	创建一个数组，数组的元素为1-100所有数字和相邻数字的和，即[1+2, 2+3, 3+4, ...]
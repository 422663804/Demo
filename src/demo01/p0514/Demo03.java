package demo01.p0514;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 1, 4, 5, 6};
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        System.out.println(Arrays.toString(array));
    }
}
//3.	编写代码实现：已知数组{3,2,1,4,5,6}，编码将数组的最大值最小值调换，要求不能硬编码：类似sz[2]=sz[5]之类。
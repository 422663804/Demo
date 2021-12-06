package demo01.p0421;

import java.util.Arrays;

public class Example02 {
    public static void main(String[] args) {
        //方法一：选择排序
        int[] array = {1, 3, 6, 7, 2, 5, 9, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        //方法二：
       /* Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
    }
}
//2.已知数组{1, 3, 6, 7, 2, 5, 9, 0}，如何将数组进行从小到大的排序?最后打印出来
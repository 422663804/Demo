package demo01.p0528;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {3, 4, 5, 6, 7}};
        int[] array2 = new int[array.length];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                num += array[i][j];
            }
            array2[i] = num;
        }
        System.out.println(Arrays.toString(array2));
    }
}
//把如下二维数组转化为一维数组，转为规则为每行之和为数组的一个新元素。
//        1 2 3 4 5
//        2 3 4 5 6
//        3 4 5 6 7


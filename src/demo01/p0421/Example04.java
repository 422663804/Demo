package demo01.p0421;

import java.util.Arrays;

public class Example04 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{10, 20, 30, 40, 50};
        int[] array3 = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array.length] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
//4.定义一个长度为5的数组值为{1,2,3,4,5},另外-个数组值为{10, 20,30, 40,50}, 使用for循环合并拼接成一个新的数组(长度为两个数组长度之和)
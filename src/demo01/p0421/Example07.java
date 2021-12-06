package demo01.p0421;

import java.util.Arrays;

public class Example07 {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] array3 = {5, 6};
        int length = array1.length + array2.length + array3.length;
        int[] newArray = new int[length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[i + array1.length] = array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            newArray[i + array1.length + array2.length] = array3[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
//7.思考题:如何拼接3个已知的数组?
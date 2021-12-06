package array;

import java.util.Arrays;

public class Example01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
//Arrays.fill快速填充数组 配合Arrays.toString()输出使用
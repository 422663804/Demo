package demo01.p0604;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] array01 = {100, 89, 98};
        int[] array02 = {98, 88, 100};
        int[] arrayNew = new int[array01.length + array02.length];
        for (int i = 0; i < array01.length; i++) {
            arrayNew[i] = array01[i];
        }
        for (int i = 0; i < array02.length; i++) {
            arrayNew[array01.length + i] = array02[i];
        }
        System.out.println("arrayNew=" + Arrays.toString(arrayNew));
    }
}
//1. 某学生第一次三科成绩为{100,89,98}，第二次成绩为{98,88,100}，请分别定义数组并将其成绩合并成一新的数组.
package demo01.p0421;

import java.util.Arrays;

public class Example03 {
    public static void main(String[] args) {
        int[] array = new int[]{90, 88, 99, 70, 92, 94, 96, 98, 94, 92};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("排序大小后的数组：" + Arrays.toString(array));
        //逻辑删除
        int index = 0;
        int sum = 0;
        int average;
        for (int i = index; i < array.length - 2; i++) {
            array[i] = array[i + 1];
        }
        //数组迁移
        int[] newArray = new int[array.length - 2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
            sum += newArray[i];
        }
        System.out.println("删除后的新数组：" + Arrays.toString(newArray));
        average = sum / newArray.length;
        System.out.println("该选手的最终得分为" + average + "分");
    }
}
/*
3.在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，
  然后剩余的8位评委的分数进行平均，就是该选手的最终得分。使用控制台输入每个评委的评分，最后计算输出该选手的得分。
  思路：
  1、去除最高分，去除最低分 则是将数组元素列一个大小顺序，然后将定义max 还有min
  2、
  */

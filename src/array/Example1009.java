package array;

import java.util.Arrays;

public class Example1009 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7, 9};
        int[] newArray = new int[array.length + 1];
        //新数组存储旧数组的元素
        for (int index = 0; index < array.length; index++) {
            newArray[index] = array[index];
        }
        //输入你想插入的数字 可以直接定义或者键盘输入
        int num = 5;
        //定义元素的检索位置
        int insertIndex = 0;
        for (int index = 0; index < newArray.length; index++) {
            if (num > newArray[index]) {
                insertIndex = index;
            }
        }
        //插入元素后检索位置往后移
        for (int index = newArray.length - 1; index > insertIndex; index--) {
            newArray[index] = newArray[index - 1];
        }
        //插入的数据存储在集合中
        newArray[insertIndex] = num;
        System.out.println(Arrays.toString(newArray));
    }
}

//1. 一直数组长度7，前6个数值为1, 2, 3, 6, 7, 9，现在插入一个新数字5，请输出插入后的数组元素（数组最后一个元素可以用0代替）
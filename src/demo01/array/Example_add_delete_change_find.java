package demo01.array;

import java.util.Arrays;

class Example_add_delete_change_find {
    public static void main(String[] args) {
        //修改数组元素-->根据数组的下标来修改元素的值
        int[] array = new int[]{1, 2, 3};
        array[0] = 8;
        array[0] = 9;//后面的会覆盖前面的 所以此时的array[0] =9;
        System.out.println(Arrays.toString(array));

        //增加数组的元素-->新建一个数组来接收旧数组的数据
        int[] array2 = new int[]{1, 2, 3};
        int[] newArray = new int[array2.length + 1];//新数组的长度为旧数组+1个长度
        newArray[newArray.length - 1] = 4; //将4传递给新数组
        //将就数组的元素传给新数组 则需要遍历旧数组
        for (int i = 0; i < array2.length; i++) {
            newArray[i] = array2[i];
        }
        //输出新数组的元素
        System.out.println(Arrays.toString(newArray));

        //删除数组中的元素，和增加数组的元素方法一样
    }
}

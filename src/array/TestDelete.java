package array;

import java.util.Arrays;

public class TestDelete {
    public static void main(String[] args) {
        //添加数组元素
        String[] name = new String[10];
        name[0] = "张三";
        name[1] = "李四";
        name[2] = "王五";
        System.out.println(Arrays.toString(name));
        //删除数组元素--->逻辑删除
        int index = 0;
        name[index] =null;
        for (int i =0;i< name.length;i++){
            if (i>index){
                name[i-1]=name[i];
            }
            name[name.length-1]=null; //最后一个元素为空
        }
        System.out.println(Arrays.toString(name));
    }
}
/*
4、删除数据:
        l 逻辑删除--使用null替换数据，模拟表示数据已经被删除      (推荐使用)
        l 物理删除--[不可能改变数组的长度，指定删除数据的位置空间不能修改]
        删除指定位置的数据，后面所有位置的数据索引减少1

        逻辑删除: java中使用null表示空、没有任何东西
        // names[0] = null; 逻辑删除了索引=0的数据
        物理删除:删除数组中索引位置的数据[索引位置都会删除]
        ①理论上的物理删除模式，不可以实现，数组长度不可以改变!
        ②删除索引位置的数据，后面所有数据索引-1
        */

package demo01.p0423;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {null, null, "破晓", "电刀", null, "破军", "普通草鞋"};
        /*
         * 思路:
         * 1、循环遍历数组，查找出数组那个位置为null
         * 2、如果为null，则在这个索引位置添加一件装备
         * 3、最后输出添加装备后的数组
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.print("请输入你的第" + (i + 1) + "件装备：");
                array[i] = input.next();
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
5. 游戏人物可以穿戴的装备数量为7个，有一个初始人物装备为{null, null, "记忆头盔", "裁决之杖", null, "", "普通草鞋"}，
   其中null表示该位置没有穿戴装备。现在要求给游戏人物添加3件装备，装备名字由控制台输入，只能装备在没有穿戴的位置。最后输出所有装。
        */

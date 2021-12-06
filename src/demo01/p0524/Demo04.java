package demo01.p0524;

import java.util.Arrays;
import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        String[] array = {"义勇军进行曲", "黄河大合唱", "祖国不会忘记"};
        String[] newArray = new String[array.length];
        Random random = new Random();
        int num = random.nextInt(array.length);
        for (int i = 0; i < array.length; i++) {
//            随机数在第一个位置
            if (num == 0) {
                newArray[i] = array[i];
            } else if (num == array.length) { //随机数在最后一个位置
                for (int j = 0; j < array.length; j++) {
                    newArray[j] = array[num - (1 + j)];
                }
            } else { //随机数在中间
                newArray[i] = array[num];
                num++;
                for (int j = 0; j < newArray.length; j++) {
                    if (newArray[j] == null) {
                        newArray[j] = array[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
//有一个字符串数组包含了当前所有的歌曲，假设使用播放器播放，随机从一首歌开始，到全部顺序播放完，把歌曲输出到控制台。

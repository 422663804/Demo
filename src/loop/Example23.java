package loop;

import java.util.Random;

public class Example23 {
    public static void main(String[] args) {
        String[] arr =new String[] {"早安","午安","晚安"};
        Random random23 = new Random();
        System.out.println("misuse时刻");
        int n = random23.nextInt(arr.length); //随机数范围定义为字符串长度
        for (int i = 0 ; i< arr.length;i++){
            System.out.println("正在播放\t"+arr[i]);
        }
    }
}
/*
1. 有一个字符串数组包含了当前所有的歌曲，假设使用播放器播放，随机从一首歌开始，到全部顺序播放完，
        把歌曲输出到控制台。
     分析：
    1. 使用随机生成器生成 数组长度范围内 的随机数
    2. 从随机数开始循环，到数组的最后
    3. 然后重新循环到随机数的前面一个，即完成了一个播放循环

*/

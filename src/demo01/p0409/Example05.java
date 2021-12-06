package demo01.p0409;

import java.util.Random;

public class Example05 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[] array = new boolean[14];
        int randInt = 0; //临时存储产生随机数
        /*while (array.length <= 13) { //数组长度超过14，退出循环体
            int n = random.nextInt(13) + 1; //将生成随机数储存在数组中
            for (int i = 1; i <= array.length - 1; i++) {
                for (int j = 1; j < i; j++) {
                    if (array[j] == array[i]) {
                        i--;
                    }
                }
                switch (i) {
                    case 11:
                        System.out.println("红桃J" + "随机数为" + i);
                        break;
                    case 12:
                        System.out.println("红桃Q" + "随机数为" + i);
                        break;
                    case 13:
                        System.out.println("红桃K" + "随机数为" + i);
                        break;
                    default:
                        System.out.println("红桃" + i + "随机数为" + i);
                        break;
                }
            }*/
        for (int i = 0; i <= array.length - 1; i++) {
            while (array[randInt]) {
//                randInt=random.nextInt(13)+1; //产生一个随机数
                randInt = (int) (Math.random() * 13 + 1);
            }
            array[randInt] = true;
            switch (randInt) {
                case 11:
                    System.out.println("红桃J" + "随机数为" + randInt);
                    break;
                case 12:
                    System.out.println("红桃Q" + "随机数为" + randInt);
                    break;
                case 13:
                    System.out.println("红桃K" + "随机数为" + randInt);
                    break;
                default:
                    System.out.println("红桃" + randInt + "随机数为" + randInt);
                    break;
            }
        }
    }
}

/*
5.循环随机生成13个整数表示13张牌，范围是1到13，如果生成的是1到10之间的数，就输出“电脑出了一张红桃几”，
比如产生了一个3就输出“电脑出了一张红桃3”，如果生成的是11就输出“电脑出了一张红桃J”，
如果生成的是12就输出“电脑出了一张红桃Q”，如果生成是13就输出“电脑出了一张红桃K（要求使用while+switch结构实现）
       分析：
       1、

        */

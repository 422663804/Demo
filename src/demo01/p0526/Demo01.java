package demo01.p0526;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            System.out.print(num + " ");
        }
    }
}
//1. 随机生成20个【1-100】范围内的整数，并打印出来。
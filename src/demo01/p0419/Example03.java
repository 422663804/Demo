package demo01.p0419;

import java.util.Random;

public class Example03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i <= array.length - 1; i++) {
            int n = random.nextInt(100) + 1;
            array[i] = n;
            System.out.print("\t" + array[i]);
        }
    }
}
//3. 定义一个整数数组，长度为15，每个元素的值为随机数，最后打印出数组的每一个元素
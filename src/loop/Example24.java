package loop;

import java.util.Random;

public class Example24 {
    public static void main(String[] args) {
        Random random24 = new Random();
        int sum =0;
        for (int i = 1;i<=20;i++){
            int n = random24.nextInt(100)+1;
            sum+=n;
            System.out.println("第"+i+"个随机数为"+n);
        }
        System.out.println("sum="+sum);
    }
}
//1. 随机生成20个【1-100】范围内的整数，并打印出来。
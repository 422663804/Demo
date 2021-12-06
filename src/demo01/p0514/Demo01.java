package demo01.p0514;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        if (num > 25) {
            System.out.println("今日适合编码！");
        } else {
            System.out.println("今日适合休息！");
        }
    }
}
//1.	编写代码实现：随机生成一个100以内的数字，如果该数字大于25则输出“今日适合编码！”，否则输出“今日适合休息！”。
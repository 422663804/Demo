package demo01.p0526;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(15); //在方法里面设置一个范围就行了
        System.out.println(num);
    }
}
//. 在Java中创建随机数可以使用随机生成器，生成一个很大（或者很小）的整数，
//        那么如何使用这种方法（nextInt()）生成一个指定大小范围的方法？比如小于15。

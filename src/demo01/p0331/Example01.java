package demo01.p0331;

//1. 实现猜拳游戏：随机生成一个随机数，并从控制台输入一个数字（0-3范围），如果这个数字和随机数相等，则胜利，否则失败。
import java.util.Random;
import java.util.Scanner;
public class Example01{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner1 = new Scanner(System.in);
        while (true){
            int i = random.nextInt(4);
            System.out.print("请输入一位（0~3）整数:\t");
            int j = scanner1.nextInt();
            if (i==j){
                System.out.println("胜利");
                break;
            }else {
                System.out.println("失败"+"该数为"+i);
            }
        }
    }
}

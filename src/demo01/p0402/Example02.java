package demo01.p0402;
/*随机生成-5到5之间的整数，从控制台输入一个整数进行猜数字游戏，如果输入的数字和随机数是一正一负则输，如果随机数为0则无输赢，
如果输入的数字和随机数都是正数，且输入的数字大于随机数则赢，否则输，如果输入的数字和随机数都是负数，且输入的数字小于随机数则赢，否则输。*/

import java.util.Random;
import java.util.Scanner;
public class Example02 {
    public static void main(String[] args) {
        int min = -5;
        int max = 5;
        Random random = new Random();
        int i = random.nextInt(max - min) + min; //+min为最小值的起始位置，（max-min+1）表示范围
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int j = scanner2.nextInt();
        if ((i > 0 && j < 0) || (i < 0 && j > 0)) {
            System.out.println("你输了，随机数为" + i);
        } else if (i == 0) {
            System.out.println("平局,随机数为0"+i);
        } else if ((i >= 0 && j >= 0) && j > i) {
            System.out.println("你赢了，随机数为" + i);
        } else if ((i < 0 && j < 0) && i < j) {
            System.out.println("你赢了，随机数为" + i);
        }

    }
}

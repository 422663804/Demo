package demo01.p0524;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int i = 0;
        while (i < 3) {
            System.out.print("请输入你要猜的数字(1-100):");
            int n = scanner.nextInt();
            if (num <= n + 3 && num >= n - 3) {
                System.out.println("You Win");
                break;
            } else if (num > n + 3) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜大了");
            }
            i++;
        }
    }
}
//    猜数字游戏(100以内)，三次机会，如果结果相差不到3获胜！每次失败电脑提示数字猜大了还是小了。
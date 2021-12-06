package demo01.p0519;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一位整数:");
        int num = scanner.nextInt();
        for (int i = 0; i < 999999999; i++) {
            if (num == Math.pow(i, 4)) {
                System.out.println("该数为四方数，是" + i + "的四次方");
                break;
            }
        }
    }
}
//输入一个整数，判断该整数是否为四方数。（四方数：一个数为另一个数的四次方）

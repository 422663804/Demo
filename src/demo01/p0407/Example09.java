package demo01.p0407;
//9. 从控制台输入一个数字n，如果n小于1程序结束，否则计算从1到这个数字n的和（比如输入10，计算1+2+3+……+10的和）

import java.util.Scanner;
public class Example09 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.print("请输入一位整数：");
        int n = scanner3.nextInt();
        while (i <= n) {
            sum += i;
            i++;
        }
        /*for (int i = 1;i<=n;i++){
            sum+=i;
        }*/
        System.out.println("sum=" + sum);
    }
}

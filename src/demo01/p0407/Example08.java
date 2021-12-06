package demo01.p0407;
//8. 从控制台输入一个数字n，使用循环打印出1到n所有数字（比如输入5，打印：1 2 3 4 5）

import java.util.Scanner;
public class Example08 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("请输入一位整数");
        int n = scanner2.nextInt();
        int i = 1;
        while (i<=n){
            System.out.print("\t"+i);
            i++;
        }
       /* for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }*/
    }
}

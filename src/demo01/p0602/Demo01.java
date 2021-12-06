package demo01.p0602;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = new char[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位整数:");
            int num = scanner.nextInt();
            array[i] = (char) num;
        }
        System.out.println(Arrays.toString(array));
    }
}

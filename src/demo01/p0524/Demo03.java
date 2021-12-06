package demo01.p0524;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串");
        String str = scanner.next();
        String[] array = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i + 1);
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
    }
}
// 从控制台输入一个字符串，把这个字符串的每一个字符串存储到一个数组中。
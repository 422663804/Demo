package demo01.p0514.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = scanner.nextLine();
        str = str.trim();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                str2.append(str.charAt(i));
            }
        }

        String[] array = new String[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            String j = str2.substring(i, i + 1);
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
    }
}
//请将字符串"a-12,b-23,c-34,d-412,e-5,f-62,g-7"转化成一个只含有字母的数组（要求不能硬编码，观察字符串规律）。
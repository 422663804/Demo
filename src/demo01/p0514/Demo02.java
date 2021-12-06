package demo01.p0514;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = scanner.nextLine();
        str = str.trim();
        StringBuilder str2 = new StringBuilder();
        if (!"".equals(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
                    str2.append(str.charAt(i));
                }
            }
        }
        System.out.print(str2);
    }
}
//2.	编写代码实现：输入一个字符串，输出该字符串中所有的，但不包括0，比如输入的是“a123b40c”，
//        则打印结果为1、2、3、4（格式无要求，字符串的所有方法可以参考课件或者Bing搜索等）。
package demo01.p0510;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example04 {
    public static void main(String[] args) {
        System.out.println("----方法1----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String str = scanner.next();
        String regEx = "[^0-9]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("").trim());
        System.out.println("----方法2----");
        str = str.trim();
        String str2 = "";
        if (str != null && !"".equals(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    str2 += str.charAt(i);
                }
            }
        }
        System.out.print(str2);
    }
}
//3.	输入一个字符串，将该字符串中包含的数字输出来（比如输入abcd123a1，则打印出1 2 3 1，打印格式任意）。
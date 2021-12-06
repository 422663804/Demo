package test.p0511;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        //字符串的特别之处
        String s1 = "abc123";
        String s2 = new String();
        String s3 = null;
        String s4 = new String("abc123");
        String s5 = "abc123";
        //printf() 输出字符串
        System.out.printf("s1 = %s, s2 = %s,s3 = %s, s4= %s %n", s1, s2, s3, s4);
        System.out.println(s1 == s4); //false -->判断地址
        System.out.println(s1.equals(s4)); //true -->判断内容是否相等
        System.out.println(s1 == s5); //true -->同一地址，节省内存空间

        //字符串是取值是对象，他是有方法的
//        toLowerCase()
//        toUpperCase()
//        equalsIgnoreCase 表示忽略大小写
        s1= "abc123";
        s2 = "ABC123";
        System.out.println("toLowerCase使用"+s1.toLowerCase().equals(s2.toLowerCase()));
        System.out.println("toUpperCase使用"+s1.toUpperCase().equals(s2.toUpperCase()));
        System.out.println("equalsIgnoreCase"+s1.equalsIgnoreCase(s2));
    }
}

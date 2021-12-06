package demo01.p0510;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入邮箱:");
        String str = scanner.next();
        int index = str.indexOf("@"); //查找@的坐标
        int index2 = str.lastIndexOf("."); //最后一个.坐标
        int index3 = str.indexOf(".");
        int count = 0; //@有多少个
        int count2 = 0; //.有多少个
        for (int i = 0; i < str.length(); i++) {
            String str2 = str.substring(i, i + 1);
            if (str2.equals("@")) {
                count++;
            }
            if (str2.equals(".")) {
                count2++;
            }
        }
        if (index == 0 || count > 1 || count2 < 1 || index2 == str.length() - 1 || index3 == index - 1) {
            System.out.println("邮箱的格式有误，请重新确认再输入!");
        } else {
            System.out.println("邮箱:" + str);
        }
    }
}
//5. 输入一个字符串代表一个邮箱，判断这个邮箱的格式是否正确，比如：aaa@aaa.aaa，规则是：
//        1）有且只有一个【@】符号
//        2）【@】符号不在最前面
//        3）至少有一个【.】符号
//        4）这个【.】不能在最后位置
//        5）【.】必须要处于【@】符号之后
//        比如：aaa.bbb@ccc.ddd符合要求！提示：注意灵活使用变量，以及嵌套语句的使用，保持逻辑清晰
//思路：
//有且只有一个【@】符号 遍历字符串
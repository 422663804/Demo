package demo01.p0510;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {

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

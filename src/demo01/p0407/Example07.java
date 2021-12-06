package demo01.p0407;
//7. 武松到景阳冈喝酒（输出：“好酒！”），喝完一碗后老板问：是否再来一碗？如果回答“y”就表示再喝一碗，直到回答“n”(或者其他字符串)为止，离开景阳冈（要求使用do...while）


import java.util.Scanner;
public class Example07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请做出你的选择");
        String i = scanner.next();
        do {
            if (i.equals("y")) {
                System.out.println("再喝一碗");
                break;
            } else if (i.equals("n")) {
                System.out.println("离开景阳冈");
                break;
            } else {
                System.out.print("请再次输入");
                i = scanner.next();
            }
        } while (true);
    }
}

package demo01.p0531;

public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//4. 打印如下数字形状：
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789

package demo01.p0414;

public class Example06 {
    public static void main(String[] args) {
        System.out.print("1-100所有质数:");
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (i == j) {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
/*
6. 思考题:打印1-100所有质数

*/

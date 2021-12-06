package demo01.p0528;

public class Demo04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                if (j * j * j == i) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("sum=" + sum);
    }
}
//计算1-100之间所有立方数的和。

package demo01.p0412;

public class Example02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
//要求使用for循环:计算从10到1 00之间所有能被7整除的数字的和。

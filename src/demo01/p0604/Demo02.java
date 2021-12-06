package demo01.p0604;

public class Demo02 {
    public static void main(String[] args) {
        double money = 10000;
        for (int i = 1; i <= 10; i++) {
            money = (money * 0.03) + money;
        }
        System.out.printf("10年后,获得:%.2f %s", money, "元");
    }
}
//1. 本金一万元存入银行，年利率是百分之三，每过1年，将本金和利息相加作为新的本金。
//        计算10年后，最后获得多少钱？
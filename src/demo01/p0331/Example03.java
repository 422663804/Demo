package demo01.p0331;
//3. 从控制台输入顾客的购物金额，最后打印其实际付款金额，购物享受折扣：顾客购物如果超过200元则打8折，超过500元7折，超过1000元5折，200以内不打折。

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("请输入商品价格:");
        double i = scanner3.nextDouble();
        if (i > 1000) {
            System.out.println("打5折，您需要支付" + i * 0.5 + "元");
        } else if (i > 500) {
            System.out.println("打7折，您需要支付" + i * 0.7 + "元");
        } else if (i > 200) {
            System.out.println("打8折，您需要支付" + i * 0.8 + "元");
        } else {
            System.out.println("购买金额少于200元，没有优惠，您需要支付" + i + "元");
        }
    }
}

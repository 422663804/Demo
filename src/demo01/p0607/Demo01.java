package demo01.p0607;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入购买金额:");
        double money = scanner.nextDouble();
        if (money > 100 && money <= 200) {
            money = money * 0.9;
            System.out.println("打九折,您需支付" + money + "元");
        } else if (money > 200 && money <= 500) {
            money = money * 0.8;
            System.out.println("打8折,您需支付" + money + "元");
        } else if (money > 500) {
            money = money * 0.6;
            System.out.println("打6折,您需支付" + money + "元");
        } else {
            System.out.println("您购买的金额少于100元，没有优惠");
        }
    }
}
//1. 商场打折促销，超过100元打9折，超过200元打8折，超过500打6折，请输入购物金额，输出结算金额。
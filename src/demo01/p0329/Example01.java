package demo01.p0329;

import java.util.Scanner;

//1.从控制台输入顾客的购物金额，打印其享受折扣后最终支付的金额:超过200元则打8折，否则9折
public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品金额");
        double i = scanner.nextDouble();
        if (i>200){
            i = i*0.8;
        }else {
            i = i*0.9;
        }
        System.out.println("享受折扣后您需支付"+i+"元");
    }
}

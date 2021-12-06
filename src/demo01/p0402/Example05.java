package demo01.p0402;
/*使用switch实现：（参考图片）请输入消费金额：240是否参加优惠换购活动：
        1： 满50元，加2元换购百事可乐饮料一瓶
        2： 满100元，加3元换购500ML可乐一瓶
        3： 满100元，加10元换购5公斤面粉
        4： 满200元，加10元换购1个电饭锅
        5： 满200元，加20元可换购爽肤水一瓶
        0： 不换购请选择：2本次消费总金额：253.0元成功换购：500ML可乐一瓶*/

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("请输入消费金额：");
        double money = scanner5.nextDouble();
        System.out.println("是否参加优惠换购活动");
        System.out.println("1:满50元，加2元换购百事可乐饮料一瓶");
        System.out.println("2:满100元，加3元换购500ML可乐一瓶");
        System.out.println("3:满100元，加10元换购5公斤面粉");
        System.out.println("4:满200元，加10元换购1个电饭锅");
        System.out.println("5:满200元，加20元可换购爽肤水一瓶");
        System.out.println("0:不换购");
        System.out.print("请选择：");
        int i = scanner5.nextInt();
        switch (i) {
            case 1:
                if (money >= 50 && money < 100) {
                    System.out.println("本次消费总金额：" + (money + 2) + "元");
                    System.out.println("成功换购:百事可乐饮料一瓶");
                } else {
                    System.out.println("您消费的金额不够，不能换购这个商品，请从新选择");
                }
                break;
            case 2:
                if (money >= 100 && money < 200) {
                    System.out.println("本次消费总金额：" + (money + 3) + "元");
                    System.out.println("成功换购:500ML可乐一瓶");
                } else {
                    System.out.println("您消费的金额不够，不能换购这个商品，请从新选择");
                }
                break;
            case 3:
                if (money >= 100 && money < 200) {
                    System.out.println("本次消费总金额：" + (money + 10) + "元");
                    System.out.println("成功换购:5公斤面粉");
                } else {
                    System.out.println("您消费的金额不够，不能换购这个商品，请从新选择");
                }
                break;
            case 4:
                if (money >= 200) {
                    System.out.println("本次消费总金额：" + (money + 10) + "元");
                    System.out.println("成功换购:1个电饭锅");
                } else {
                    System.out.println("您消费的金额不够，不能换购这个商品，请从新选择");
                }
                break;
            case 5:
                if (money >= 200) {
                    System.out.println("本次消费总金额：" + (money + 20) + "元");
                    System.out.println("成功换购:爽肤水一瓶");
                } else {
                    System.out.println("您消费的金额不够，不能换购这个商品，请从新选择");
                }
                break;
            case 0:
                System.out.println("不换购");
                break;
            default:
                System.out.println("您输入的有误，请从新输入：");
                break;
        }
    }
}


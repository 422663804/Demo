package demo02.oop609.demo04;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compute compute = new Compute();
        System.out.println("----------------------");
        System.out.println("----1-计算三角形周长-----");
        System.out.println("----2-计算长方形面积-----");
        System.out.println("----3-计算圆的周长-----");
        System.out.println("----4-计算圆的面积-----");
        System.out.println("----------------------");
        System.out.print("请输入你的选择:");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1:
                compute.perimeter();
                break;
            case 2:
                compute.longArea();
                break;
            case 3:
                compute.circle();
                break;
            case 4:
                compute.circleArea();
                break;
            default:
                System.out.println("您输入的有误!");
                break;
        }
    }
}

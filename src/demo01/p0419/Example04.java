package demo01.p0419;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        double[] array = new double[10];
        double sum = 0;
        double average;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= array.length; i++) {
            System.out.print("请输入第" + i + "位数：");
            double num = scanner.nextDouble();
            sum += num;
        }
        average = sum / array.length;
        System.out.println("sum=" + sum + "average=" + average);
    }
}
//4. 创建一个长度为10的整数数组，使用控制台扫描器给这个数组进行赋值，最后计算所有元素的和、平均值
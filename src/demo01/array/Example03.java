package demo01.array;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        double[] str = new double[10];
        for (double j = 0 ;j<= str.length-1;j++){
            System.out.print("请输入一个整数:");
            str[(int) j] = scanner.nextDouble();
            sum+=str[(int) j];
        }
        System.out.println("所有的和为="+sum+"平均值="+sum/ (str.length));
    }
}

/*
创建一个长度为10的整数数组，使用控制台扫描器给这个数组进行赋值，最后计算所有元素的和、平均值
分析：
1、定义长度一个为10的数组  动态数组
2、扫描器输入  Scanner
3、计算所有元素的和、平均值
*/

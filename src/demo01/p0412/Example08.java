package demo01.p0412;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        System.out.println("--------------while-------------");
        Scanner sc02 = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = sc02.nextInt();
        int max = num;
        int min = num;
        while (num!=0){
            System.out.print("请输入数字：");
             num = sc02.nextInt();
             if (num>max){
                 max=num;
             }
             if (num<min){
                 min=num;
             }
        }
        System.out.println("max="+max+"min="+min);
      /*  double max = -1;
        double min = 999999999;
        int i = 0;*/
       /* while (n!=0) {
            i++;
            System.out.print("请输入" + i + "数字：");
            double n = sc02.nextDouble();
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
       System.out.println("一共输入了" + i + "数字，最大值max=" + max + "最小值min=" + min);*/
       /* System.out.println("---------------for--------------");
        for (i = 1; ; i++) {
            System.out.print("请输入第" + i + "位数字：");
            double n = sc02.nextDouble();
            if (n == 0) {
                System.out.println("一共输入了" + (i - 1) + "数字，最大值max=" + max + "最小值min=" + min);
                break;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }*/
    }
}
/*
要求使用while和for循环分别完成:循环输入数字，直到输入0截止退出循环并输出这些数学中的最大值、最小值。
        (本题的终止数字0可以计入，也可以忽略不作处理，实现基本思路即可! )
*/

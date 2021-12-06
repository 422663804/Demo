package loop;

public class Example44 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            sum1 += 1.0 / i;
            sum2 += i;
        }
        sum2 = 1 / sum2;
        if (sum1 > sum2) {
            System.out.println("sum1>sum2");
        } else {
            System.out.println("sum1<sum2");
        }
    }
}
/*
题目：利用程序判断1/1+1/2+1/3+....+1/10与1/(1+2+...+10)的大小。
    1. 使用循环分别计算两组数字之和
    2. 比较结果，输出
    3. 注意小数整数之分
*/

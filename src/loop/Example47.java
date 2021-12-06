package loop;

public class Example47 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=100;i++){
            if (i%3!=0){
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
}
/*
题目分析：计算1-100中所有非3的倍数的数字之和。
1、范围1-100  定义范围
2、范围内所有非3的倍数  需要判断
3、计算和 sum
 */
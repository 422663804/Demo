package loop;

public class Example25 {
    public static void main(String[] args) {
    /*    int sum=0;
        for (int i = 1;i<=100;i++){
            sum+=i*i*i;
        }
        System.out.println("sum="+sum);*/
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (j * j * j == i) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("1-100之间所有立方数的和：" + sum);
    }
}
/*
     计算1-100之间所有立方数的和。
 分析：
    1. 使用循环查看1-100之间的每一个数字
    2. 判断该数字是否为立方数，即等于某个数的立方
    3. 如果为立方数，加到总和
*/

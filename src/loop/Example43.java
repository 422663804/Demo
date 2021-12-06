package loop;

public class Example43 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<=100;i++){
            for (int j = 0;j<=i;j++){
                if (j*j==i){
                    sum+=i;
                }
            }
        }
        System.out.println("sum="+sum);
    }
}
/*
 求1-100之内所有平方数的和。
 平方数：指的是某个整数的平方的数，即其平方根为整数的数 例 9=3*3
 1、范围1-100
 2、计算范围内平方数的和
*/

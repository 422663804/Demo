package loop;

public class Example46 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            System.out.println(" " + (i % 10));
        }
    }
}
/*
题目分析：循环打印100-1000所有数字的个位数。
1、循环打印
2、范围100-1000 即范围为三位数i
3、打印个位数  i%10;
*/

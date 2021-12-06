package demo01.p0602;

public class Demo03 {
    public static void main(String[] args) {
        double[] array = {1.1, 1.2, 4.1, 5.5, 6.3, 7.9, 9.0};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum=" + sum);
    }
}
//1. 有一组数字值分别是：1.1,1.2,4.1,5.5,6.3,7.9,9.0，求其总和以及平均值。

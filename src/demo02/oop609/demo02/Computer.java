package demo02.oop609.demo02;

public class Computer {
    public void cube(double num) {
        double cube = Math.pow(num, 3);
        System.out.println("num的立方数cube=" + cube);
    }

    public int findMax(int i, int j, int k) {
        return Math.max((Math.max(i, j)), k);
    }

    public int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
//2. 写一个电脑的类，类中没有属性，有方法：
//（一）有参，无返回方法：输出一个整数的立方，要求传入一个整数计算出其立方后输出结果。
//（二）有参，有返回方法：找最大值方法，要求传入三个整数，找出最大的整数并返回。
//（三）一个整形数组中找最大值的方法，要求传入一个整形数组，返回这个数组中的最大值（不要使用Arrays.sort()）。

package demo01.p0505.mathe;

public class Mathe {
    public int compare(int num1, int num2) {
        int result = Math.max(num1, num2);
        System.out.println("最大的值Max=" + result);
        return result;
    }

    public double compare2(double n1, double n2, double n3) {
        double min = 0;
        if (n1 <= n2 && n1 <= n3) {
            System.out.println("最小的值为" + n1);
            return min = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("最小的值为" + n2);
            return min = n2;
        } else {
            System.out.println("最小的值为" + n3);
            return min = n3;
        }
    }

    public int outNum(int num) {
        int one = num % 10;
        System.out.println("这位整数的个位数为" + one);
        return one;
    }

    public int cube(int num) {
        int cubeNum = num * num * num;
        System.out.println("这个整数的立方=" + cubeNum);
        return cubeNum;
    }

    public int sumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1加到num=" + sum);
        return sum;
    }

    public double array(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

    public double array2(double[] array2) {
        double max = 0;
        for (double v : array2) {
            for (int j = 0; j < array2.length - 1; j++) {
                max = Math.max(v, array2[j]);
            }
        }
        System.out.println("数组最大的值=" + max);
        return max;
    }
}
//5. 写一个数学家的类，类中有方法：方法可以传入多个值（即多个参数，返回—即方法的返回值）
//        （一）传入两个整数，进行比较，返回两个数中的最大值的方法。
//        （二）传入三个double型的数据，进行比较，返回三个数中的最小值的方法。
//        （三）传入一个整数，返回这个整数的个位数是几的方法。
//        （四）传入一个整数，返回这个整数的立方的方法。
//        （五）传入一个正整数，计算从1加到此整数的和是多少的方法。比如输入一个5那么就计算1+2+3+4+5=15
//        （六）传入一个double类型的的数组{4.2,4.5,5.6,1.2,7.8,3.4}求这个数组的和，将结果返回
//        （七）传入一个double类型的的数组{4.2,4.5,5.6,1.2,7.8,3.4}将这个数组最大，将最大值返回
//        最后测试类测试每一个方法。（返回 即 return）

package demo01.p0428;

import java.util.Scanner;

public class Mathematics {
    public String name;
    public int num1 = 123;
    public int num2 = 1234;
    public int num3 = 12;
    public double[] array = {3.12, 3.13, 3.14};

    Scanner scanner = new Scanner(System.in);

    //方法一
    public void compare() {
        System.out.println("------------方法一--------------");
        int max = Math.max(num1, num2);
        System.out.println(max);
      /*  if (num1 > num2) {
            System.out.println("最大的数字是" + num1);
        } else if (num1 == num2) {
            System.out.println("数字1和数字2相等");
        } else {
            System.out.println("最大数字的是" + num2);
        }*/
    }

    //方法二
    public void compare2() {
        System.out.println("------------方法二--------------");
        System.out.print("请输入第1位整数:");
        int num1 = scanner.nextInt();
        System.out.print("请输入第2位整数:");
        int num2 = scanner.nextInt();
        System.out.print("请输入第3位整数:");
        int num3 = scanner.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("最小的值为" + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("最小的值为" + num2);
        } else {
            System.out.println("最小的值为" + num3);
        }
    }

    //方法三
    public void outNum3() {
        System.out.println("------------方法三--------------");
    /*    System.out.print("请输入第3位整数:");
        int num3 = scanner.nextInt();*/
        int one = num3 % 10;
        System.out.println("num3个位数为:" + one);
    }

    //方法四
    public void arrays() {
        System.out.println("------------方法四--------------");
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        System.out.println("数组的和sum=" + sum);
    }

    //方法五
    public void max() {
        System.out.println("------------方法五--------------");
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max = array[i];
                    break;
                }
            }
        }
        System.out.println("数组的最大值max=" + max);
    }

    //方法六
    public void zero() {
        System.out.println("------------方法六--------------");
        num1 = num2 = num3 = 0;
        System.out.println("调用归零方法后num2的值=" + num2);
    }
}

/*6. 写一个数学家的类，有属性：数学家名字，整数数字1，整数数字2，整数数字3，小数数组（长度未知），有以下多个方法：
        （一）方法一：输出数字1和数字2中大的那个数字。
        （二）方法二：输出三个数中的最小值。
        （三）方法三：输出数字3这个整数的个位数。
        （四）方法四：输出数组的所有小数的和，将结果打印出来
        （五）方法五：输出数组的最大值
        （六）方法六：归零方法，调用该方法后数学家的三个整数的值都变为了0（在入口中测试调用该方法后，还要输出任意一个整数进行测试是否真的为0）*/

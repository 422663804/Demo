package demo02.oop609.demo02;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cube(3);
        System.out.println(computer.findMax(7, 9, 1));
        System.out.println(computer.arrayMax(new int[]{4, 5, 6, 7, 8, 9}));
    }
}
//写一个测试类，生成一台电脑，首先调用计算立方的方法，传入一个3，看输出结果是否是27。
//再调用找最大值的方法，传入7,9,1，接收返回值后输出来看看是否是9，准备数组{4，5，6，7，9}传递给对应方法，找最大值查看是否为9。
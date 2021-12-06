package demo02.oop618.demo01;

public class Computer {

    public char add(char a, char b) {
        return (char) (a + b);
    }

    public int add(int a, int b) {
        return (int) (a + b);
    }

    public double add(double a, double b) {
        return (double) (a + b);
    }

    public long add(long a, long b) {
        return (long) (a + b);
    }

    public float add(float a, float b) {
        return (float) (a + b);
    }

    public byte add(byte a, byte b) {
        return (byte) (a + b);
    }
}
//1. 编写一个计算机(Computer)类：有计算数字之和的三个方法如下：
//public char add(char a, char b);
//public int add(int a, int b);
//public double add(double a, double b);
//请使用方法重载实现，并对所有基础数据类型（byte/short/char/int/long/float/double）进行测试。


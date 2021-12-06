package demo02.oop0628.demo02.p01;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void getArea() {
        double p = (getA() + getB() + getC()) / 2;
        double s = (p * (p - this.a) * (p - this.b) * (p - this.c));
        double TriangleArea = Math.sqrt(s);
        System.out.printf("三角形的面积为%.2f", TriangleArea);
        System.out.println();
    }

    @Override
    public void getPerimeter() {
        double TriangleLength = this.a + this.b + this.c;
        System.out.printf("三角形的周长为:%.2f", TriangleLength);
        System.out.println();
    }
}

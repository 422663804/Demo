package demo02.oop0628.demo02.p01;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void getArea() {
        double RectangleArea = this.width * this.length;
        System.out.printf("长方形的面积%.2f", RectangleArea);
        System.out.println();
    }

    @Override
    public void getPerimeter() {
        double RectangleLength = this.length * 2 + this.width * 2;
        System.out.printf("长方形的周长为:%.2f", RectangleLength);
        System.out.println();
    }
}

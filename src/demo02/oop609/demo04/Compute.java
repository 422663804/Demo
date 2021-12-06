package demo02.oop609.demo04;

public class Compute {
    //    计算三角形周长
    public void perimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        double longPerimeter = triangle.getB1() + triangle.getB2() + triangle.getB3();
        System.out.printf("三角形周长=%.2f", longPerimeter);
    }

    //    计算长方形面积
    public void longArea() {
        Square square = new Square(5, 6);
        double longArea = square.getLength01() * square.getWidth();
        System.out.printf("长方形面积=%.2f", longArea);
    }

    //    计算圆的周长
    public void circle() {
        Circle circle = new Circle(10);
        double circleLong = circle.PI * circle.getR() * 2;
        System.out.printf("圆的周长=%.2f", circleLong);
    }

    //    计算圆的面积
    public void circleArea() {
        Circle circle = new Circle(10);
        double circleArea = circle.getR() * circle.getR() * circle.PI;
        System.out.printf("圆的面积=%.2f", circleArea);
    }
}
//定义Compute类用于计算各种图形的周长或者面积，有方法compute(1-4)：
//  计算三角形周长，计算长方形面积，计算圆的周长，计算圆的面积。
// 定义三个类：三角形Triangle（属性为三边）、长方形Square（属性为长和宽）、圆形Circle（属性为半径）。
// 编写测试类，调用方法由用户输入进行选择： 1-计算三角形周长 2-计算长方形面积 3-计算圆的周长 4-计算圆的面积
// 然后由用户输入3个数字用于生产对应的类（如果是长方形就是用前两个数字作为属性，如果是圆使用第一个数字即可），最后输出计算结果。
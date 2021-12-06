package demo02.oop0628.demo02.p01;

public class Computer extends TestShape {

    //    计算面积
    public void calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.getArea();
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            triangle.getArea();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            rectangle.getArea();
        } else {
            System.out.println("您输入的有误！请重新确认再输入");
        }
    }

    //    计算周长
    public void calculatePerimeter(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.getPerimeter();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            rectangle.getPerimeter();
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            triangle.getPerimeter();
        }
    }

    @Override
    public void makeShape(int id) {
        if (id == 1) {
            System.out.println("三角形");
        } else if (id == 2) {
            System.out.println("圆");
        } else if (id == 3) {
            System.out.println("长方形");
        }
    }
}

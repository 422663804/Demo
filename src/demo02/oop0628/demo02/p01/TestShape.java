package demo02.oop0628.demo02.p01;

public abstract class TestShape {

    public abstract void makeShape(int id);
//    public abstract String makeShape(int id);

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.calculateArea(new Circle("三角形", 8));
        computer.calculateArea(new Triangle("Triangle", 3, 4, 5));
        computer.calculateArea(new Rectangle("Rectangle", 10, 20));
        System.out.println("---计算周长---");
        computer.calculatePerimeter(new Circle("三角形", 8));
        computer.calculatePerimeter(new Triangle("Triangle", 3, 4, 5));
        computer.calculatePerimeter(new Rectangle("Rectangle", 10, 20));
        System.out.println("---返回形状---");
        computer.makeShape(1);
        computer.makeShape(2);
        computer.makeShape(3);
    }
}
//2.1 编写一个形状类Shape，具有名字name属性，具有抽象方法getArea()计算面积，以及抽象方法getPerimeter()计算周长；要求：
//        （一）编写形状类的实现类圆形Circle，有属性半径；具体类长方形Rectangle，有属性长和宽，具体类三角形Triangle，有属性三条边
//        （二）编写计算机类Computer，添加计算形状面积的方法calculateArea(Shape)，以及计算形状周长的方法calculatePerimeter(Shape)
//        （三）编写测试类，测试类添加静态方法：makeShape(int)，根据参数返回不同的形状????，使用计算机计算不同形状的面积和周长。

//        注：三角形面积计算公式：S=sqrt[p(p-a)(p-b)(p-c)]，其中sqrt为开平方根，Math类有该方法，p=(a+b+c)/2即三边之和的一半，
//        严格来说，三边有两边之和不大于另一半那么可以直接返回面积0，这点可不做实现。


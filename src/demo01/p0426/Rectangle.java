package demo01.p0426;

public class Rectangle {
    public double length;
    public double width;

    public static void main(String[] args) {
        double area; //面积
        Rectangle rectangle = new Rectangle();
        rectangle.length = 20;
        rectangle.width = 10;
        area = rectangle.length * rectangle.width;
        System.out.println("area=" + area);
    }
}
//2.	写一个长方形的类，类中的属性:长方形的长和宽。再写一个入口主类做测试，生成几个具体长方形对象，输出每一个长方形对象的面积。
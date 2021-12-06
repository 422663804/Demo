package demo01.p0428;

import java.util.Scanner;

public class Car {
    public String brand;
    public double price;
    public String color;

    public static void main(String[] args) {
        System.out.println("请依次输入汽车的品牌、价格、颜色");
        Car01 car = new Car01();
        car.action();
        car.accelerate();
        car.all();
        car.buy();
    }
}

class Car01 {
    Scanner scanner = new Scanner(System.in);
    String brand = scanner.next();
    double price = scanner.nextDouble();
    String color = scanner.next();

    public void all() {
        System.out.println("汽车是" + brand + "品牌" + " 价格是" + price + " 颜色为" + color);
    }

    public void action() {
        System.out.println(brand + "品牌的汽车启动了");
    }

    public void accelerate() {
        System.out.println(brand + "品牌的汽车加速中");
    }

    public void buy() {
        System.out.println(brand + "品牌的汽车被以" + price * 0.8 + "元的价格卖了," + price * 0.8 + "元为标价的8折");
    }


}
/*写一个汽车的类，类中有属性：品牌，标价，颜色。类中有方法：
        （一）显示当前汽车对象的所有属性的方法
        （二）汽车启动的方法，要求输出“XX品牌的汽车启动了”。
        （三）汽车加速的方法，要求输出“XX品牌的汽车加速中”。
        （四）汽车被卖的方法一，要求输出“XX品牌的汽车被以YY元的价格卖了”，YY元为标价的8折。
        编写测试类，对每一个方法进行测试！
        */

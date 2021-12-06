package demo01.p0521.car;

public class Car {
    public void action() {
        System.out.println("汽车发动");
    }

    public double run(int oil) {
        return oil * 2;
    }

    public void price(double price) {
        System.out.println("汽车的售价为:" + price);
    }
}
//5. 创建一个汽车类，有如下方法：
//        1) 汽车发动
//        2) 汽车行驶，输出油耗
//        3) 汽车以某价格售出

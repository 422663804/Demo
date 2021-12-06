package demo02.oop618.demo04;

public class Car04 {
    private String carAddress;
    private int count = 0;

    public Car04(String carAddress) {
        this.carAddress = carAddress;
    }

    public String getCarAddress() {
        return carAddress;
    }

    public void setCarAddress(String carAddress) {
        this.carAddress = carAddress;
    }

    //    汽车生产
    public void produce() {
        if (count < 10 && count >= 0) {
            System.out.println("正在" + this.carAddress + "生产汽车");
            count++;
        } else {
            scrapRecycling();
            System.out.println("不能超过10台汽车，请回收汽车后继续生产");
        }
    }

    //报废回收
    public void scrapRecycling() {
        System.out.println("汽车回收站在" + getCarAddress());
    }
}
//4. 实现一个单例工厂类，该类只能生产 一个实例 ，有方法：生产新的汽车，要求该工厂最多只能生产10台汽车，超过数量要么回收汽车继续生产，要么无法生产。
//        编写一个汽车类，有属性：生产工厂
//        有方法：报废回收，其他若干属性和方法自定义。
//        编写测试类进行测试。



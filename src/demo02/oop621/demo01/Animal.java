package demo02.oop621.demo01;

public class Animal {
    private String name;
    private double weight;

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("真香！真好吃！");
    }
}
//1. 使用继承机制实现简单的动物世界：
//        （一）创建所有动物的基类Animal类，有属性：名称name，体重weight，创建构造函数初始化属性，定义eat吃的方法，输出“真香！真好吃！”
//        （二）创建动物子类：狗类Dog，为狗类添加bite咬人的方法，输出“惹我，咬死你，兔子急了还咬狗呢！”
//        （三）创建动物子类：青蛙类Frog，为青蛙类添加swim游泳的方法，输出“洗澡，真凉快，快来一起荡起双桨吧！”
//        （四）为狗类和青蛙类定义构造函数初始化属性，要求必须使用super调用父类的构造函数
//        测试：创建一只狗对象，调用其方法；创建一只青蛙，调用其方法，注意包括父类的方法。
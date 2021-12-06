package interfaceTest;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Bird bird = new Bird();
        bird.fly();
        Bomber bomber = new Bomber();
        bomber.fly();
        bomber.attack();
    }
}

//飞翔的接口
interface Flyable {
    //    定义全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; // public static final可以省略

    //    定义抽象方法
    public abstract void fly();

    void stop(); // public abstract 书写时可以写
}

//攻击的接口
interface attackShot {
    void attack();
}

//实现接口的方法
//1、将接口中的抽象方法都实现
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("小鸟在飞翔");
    }

    @Override
    public void stop() {

    }
}

//2、将接口中的抽象方法部分实现 注意抽象类不能实例化对象
abstract class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("这是实现类中的通过将方法定义为abstract 转为抽象方法，可以将接口中的部分抽象方法给重写");
    }
}

//实现多继承接口
class Bomber extends Object implements Flyable, attackShot {

    @Override
    public void fly() {
        System.out.println("多接口中的fly()");
    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {
        System.out.println("多接口的attack()方法");
    }
}
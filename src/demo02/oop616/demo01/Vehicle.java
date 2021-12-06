package demo02.oop616.demo01;

public class Vehicle {
    private double speed;
    private String producer;
    private double i; //设置每次速度的变化

    public Vehicle() {

    }

    public Vehicle(double speed, String producer) {
        this.speed = speed;
        this.producer = producer;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0) {
            System.out.println("速度speed不能小于0");
        } else {
            this.speed = speed;
        }
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public void move() {
        System.out.println(producer + "汽车以速度" + speed + "Km/h移动");
    }

    public void setSpeed(int speed) {

    }

    public void speedUp() {
        if (speed >= 0) {
            speed = speed * i;
            System.out.println("汽车经过加速后以速度" + speed + "Km/h移动");
        } else {
            System.out.println("汽车正在倒车");
        }
    }

    public void speedDown() {
        if (speed > 0) {
            speed = speed - (speed / i);
            System.out.println("汽车经过减速后以速度" + speed + "Km/h移动");
        } else if (speed == 0) {
            System.out.println("汽车已停止");
        } else {
            System.out.println("汽车正在倒车");
        }
    }
}
//请定义一个交通工具(Vehicle)类，有属性：速度(speed)，生产商(producer)等；有方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等。
//        编写测试类，实例化一个交通工具对象，并通过方法给它初始化属性的值，并且打印出来，要求：
//        （一）所有属性字段使用private封装起来
//        （二）设置的速度不能为负值！
//        （三）调用加速，减速的方法能对速度进行改变，同样速度不能为负值，最低为0

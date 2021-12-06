package interfaceTest;

public class Demo06 {
    public static void main(String[] args) {
//        从工厂当中获取一个车
        NewCar car01 = new Audi01Factory().getCar();
        NewCar car02 = new Speed01Factory().getCar();
        car01.run();
        car02.run();
    }
}

//Car接口
interface NewCar {
    void run();
}

//奥迪
class Audi01 implements NewCar {

    @Override
    public void run() {
        System.out.println("奥迪正在行驶");
    }
}

//奔驰
class Speed01 implements NewCar {

    @Override
    public void run() {
        System.out.println("奔驰正在行驶");
    }
}

//工厂接口
interface CarFactory01 {
    NewCar getCar();
}

//工厂类
class Audi01Factory implements CarFactory01 {

    @Override
    public Audi01 getCar() {
        return new Audi01();
    }
}

class Speed01Factory implements CarFactory01 {

    @Override
    public Speed01 getCar() {
        return new Speed01();
    }
}
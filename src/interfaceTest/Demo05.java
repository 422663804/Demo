package interfaceTest;

/*
无工厂模式
 */


public class Demo05 {
    public static void main(String[] args) {
//        Audi audi = new Audi();
//        BYD byd = new BYD();
//        audi.run();
//        byd.run();

        ImplCar car01 = CarFactory.getCar("奥迪");
        car01.run();
        ImplCar car02 = CarFactory.getCar("奔驰");
        car02.run();
    }
}

class Audi implements ImplCar {
    @Override
    public void run() {
        System.out.println("奥迪正在行驶");
    }
}

class Speed implements ImplCar {

    @Override
    public void run() {
        System.out.println("奔驰正在行驶");
    }
}

class CarFactory {
    public static ImplCar getCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("奔驰".equals(type)) {
            return new Speed();
        } else {
            return null;
        }
    }
}
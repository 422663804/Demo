package demo02.oop616.demo01;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(70, "奥迪");
        vehicle.setI(6);
        vehicle.move();
        vehicle.speedUp(); //先加速
        vehicle.speedDown(); //后减速
    }
}

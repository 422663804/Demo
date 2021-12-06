package face.p_extends;

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.name = "佩奇";
        pig.run();
        pig.eat();
        pig.play();

        Car car = new Car();
        car.name = "Tom";
        car.eat();
        car.run();
        car.play();
    }
}

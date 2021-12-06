package demo02.oop621.demo02;

public class Test {
    public static void main(String[] args) {
        Fruit[] array = new Fruit[3];
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();
        array[0] = apple;
        array[1] = banana;
        array[2] = orange;
        for (Fruit fruit : array) {
            if (fruit != null) {
                fruit.eat();
            }
        }
    }
}

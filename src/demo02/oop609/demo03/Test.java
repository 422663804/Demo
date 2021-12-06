package demo02.oop609.demo03;

public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.name = "喜羊羊";
        sheep.eat();
        Wolf wolf01 = new Wolf();
        wolf01.name = "灰太狼";
        wolf01.run();
        Wolf wolf02 = new Wolf();
        wolf02.name = "红太狼";
        wolf02.catchSheep();
    }
}

package demo02.oop621.demo03;

public class Boss extends Enemy {
    @Override
    public void dead() {
        System.out.println("我是大Boss，没想到被打败了");
    }
}

package demo02.oop621.demo03;

public class DreadEnemy extends Enemy {
    @Override
    public void dead() {
        System.out.println("我是DreadEnemy，没想到被打败了");
    }
}

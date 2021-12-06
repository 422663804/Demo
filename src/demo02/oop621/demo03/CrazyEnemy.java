package demo02.oop621.demo03;

public class CrazyEnemy extends Enemy {
    @Override
    public void dead() {
        System.out.println("我是CrazyEnemy，没想到被打败了");
    }
}

package demo02.oop621.demo03;

public class CuteEnemy extends Enemy{
    @Override
    public void dead() {
        System.out.println("我是CuteEnemy，没想到被打败了");
    }
}

package demo02.oop623.demo03;

public class MainB {
    public static void main(String[] args) {
        TestB testB = new TestB();
        testB.shot(new AK47());
        testB.shot(new Shotgun());
        testB.shot(new Pistol());
        testB.testGun(new Pistol());
        testB.testGun(new Pistol());
        testB.testGun(new Gun());
    }
}

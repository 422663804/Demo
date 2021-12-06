package demo02.oop623.demo03;

public class Main {
    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.shot(new AK47());
        testA.shot(new Shotgun());
        testA.shot(new Pistol());
        testA.testGun(new Pistol());
        testA.testGun(new Shotgun());
    }
}

//3.2. 在上一题的基础上添加试验员A类，要求在此类中使用方法重载完成对所有枪的shot开枪方法并进行试验：
//        （一）添加试验方法：testGun(Pistol gun);
//        （二）重载试验方法：testGun(Shotgun gun);
//        （三）重载试验方法：testGun(AK47 gun);
//        （四）添加入口进行测试，生成一个验枪员对象，再生成三种枪各一个对象，调用验枪员的试验方法，传入每把枪查看输出结果。
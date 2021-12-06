package demo02.oop623.demo03;

public class TestA {

    public void shot(AK47 aK47) {
        System.out.println("这是一把AK47");
    }

    public void shot(Shotgun shotgun) {
        System.out.println("这是一把Shotgun");
    }

    public void shot(Pistol pistol) {
        System.out.println("这是一把Pistol");
    }

    public void testGun(Pistol gun) {
        System.out.println("这是实验方法Pistol");
    }

    public void testGun(Shotgun gun) {
        System.out.println("这是实验方法Shotgun");
    }
}
//3.2. 在上一题的基础上添加 试验员A 类，要求在此类中使用方法重载 overload 完成对所有枪的shot开枪方法并进行试验：
//        （一）添加试验方法：testGun(Pistol gun);

//        （二）重载试验方法：testGun(Shotgun gun);
//        （三）重载试验方法：testGun(Shotgun gun);
//        （四）添加入口进行测试，生成一个验枪员对象，再生成三种枪各一个对象，调用验枪员的试验方法，传入每把枪查看输出结果。
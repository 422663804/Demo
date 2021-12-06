package demo02.oop623.demo03;

public class TestB extends TestA {
    @Override
    public void shot(AK47 aK47) {
        System.out.println("这是测试员B下重写的shot方法AK47");
    }

    @Override
    public void shot(Shotgun shotgun) {
        System.out.println("这是测试员B下重写的shot方法Shotgun");
    }

    @Override
    public void shot(Pistol pistol) {
        System.out.println("这是测试员B下重写的shot方法Pistol");
    }

    @Override
    public void testGun(Pistol gun) {
        System.out.println("这是测试员B下重写的testGun方法Pistol");
    }

    @Override
    public void testGun(Shotgun gun) {
        System.out.println("这是测试员B下重写的testGun方法Shotgun");
    }

    public void testGun(Gun gun) {
        System.out.println("这是测试员B下testGun方法Gun");
    }
}
//3.3. 在上一题基础上，再重新写一个验枪员B类，要求在此类中使用方法重写来完成以上功能的设计：
//        （一）添加方法如下：testGun(Gun gun)，注意参数类型
//        （二）无其他方法，添加入口进行测试，生成一个验枪员传入各种枪对象进行测试，比较并总结与上一题的异同点。

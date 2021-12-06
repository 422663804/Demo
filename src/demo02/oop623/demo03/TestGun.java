package demo02.oop623.demo03;

public class TestGun {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun = new Pistol();
        gun.setColor("白色");
        gun.setMetre(1500);
        gun.shot();
        gun = new Shotgun();
        gun.shot();
        gun = new AK47();
        gun.setWidth(50);
        gun.setMetre(1500);
        gun.shot();
    }
}
//3.1.  写一个Gun枪类，类中有属性：射程、重量、颜色；有一个带参数的构造函数；还有一个shot开枪的方法，方法内容输出“??颜色、??射程、重??公斤的枪开枪了”
//        （一）添加子类：Pistol手枪类，类中有属性射程、颜色，有一个开枪的方法，输出“??颜色的手枪，射程??米，一颗子弹打出去了”
//        （二）添加子类：Shotgun猎枪类：类中有属性重量、颜色，无其他方法
//        （三）添加在类：AK47机枪类：类中有属性射程、重量，有一个开枪的方法，输出“重??公斤的AK47，射程??米，一连串弹打出去了”
//        （四）编写测试类，定义一个Gun类型的变量gun，用此变量引用一个手枪的对象，调用这把枪的开枪方法，观察输出的结果
//        （五）生成一个猎枪对象并放入到这个枪的变量gun中去，又调用这把枪的开枪方法，观察输出结果
//        （六）生成一个机枪对象并放入到这个枪的变量gun中去，又调用这把枪的开枪方法，观察输出结果

//3.2. 在上一题的基础上添加试验员A类，要求在此类中使用方法重载完成对所有枪的shot开枪方法并进行试验：
//        （一）添加试验方法：testGun(Pistol gun);
//        （二）重载试验方法：testGun(Shotgun gun);
//        （三）重载试验方法：testGun(AK47 gun);
//        （四）添加入口进行测试，生成一个验枪员对象，再生成三种枪各一个对象，调用验枪员的试验方法，传入每把枪查看输出结果。


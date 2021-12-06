package demo02.oop623.demo03;

public class AK47 extends Gun {
    @Override
    public void shot() {
        System.out.println("重" + this.getWidth() + "公斤的AK47，射程" + this.getMetre() + "米，一连串弹打出去了");
    }
}
//        （一）添加子类：Pistol手枪类，类中有属性射程、颜色，有一个开枪的方法，输出“??颜色的手枪，射程??米，一颗子弹打出去了”
//        （二）添加子类：Shotgun猎枪类：类中有属性重量、颜色，无其他方法
//        （三）添加在类：AK47机枪类：类中有属性射程、重量，有一个开枪的方法，输出“重??公斤的AK47，射程??米，一连串弹打出去了”
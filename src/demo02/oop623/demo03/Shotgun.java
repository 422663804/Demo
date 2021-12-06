package demo02.oop623.demo03;

public class Shotgun extends Gun {
    private double width02;
    private String color02;

    public Shotgun() {

    }

    public Shotgun(double width02, String color02) {
        this.width02 = width02;
        this.color02 = color02;
    }

    public Shotgun(double metre, double width, String color, double width02, String color02) {
        super(metre, width, color);
        this.width02 = width02;
        this.color02 = color02;
    }

    public double getWidth02() {
        return width02;
    }

    public void setWidth02(double width02) {
        this.width02 = width02;
    }

    public String getColor02() {
        return color02;
    }

    public void setColor02(String color02) {
        this.color02 = color02;
    }

    @Override
    public void shot() {
        System.out.println("猎枪");
    }
}
//        （一）添加子类：Pistol手枪类，类中有属性射程、颜色，有一个开枪的方法，输出“??颜色的手枪，射程??米，一颗子弹打出去了”
//        （二）添加子类：Shotgun猎枪类：类中有属性重量、颜色，无其他方法
//        （三）添加在类：AK47机枪类：类中有属性射程、重量，有一个开枪的方法，输出“重??公斤的AK47，射程??米，一连串弹打出去了”
package demo02.oop623.demo03;

public class Gun {
    private double metre;
    private double width;
    private String color;

    public Gun() {

    }

    public Gun(double metre, double width, String color) {
        this.metre = metre;
        this.width = width;
        this.color = color;
    }

    public double getMetre() {
        return metre;
    }

    public void setMetre(double metre) {
        this.metre = metre;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void shot() {
        System.out.println(this.color + "颜色、" + this.metre + "射程、重" + this.width + "公斤的枪开枪了”");
    }
}

//3.1.  写一个Gun枪类，类中有属性：射程、重量、颜色；有一个带参数的构造函数；还有一个shot开枪的方法，方法内容输出“??颜色、??射程、重??公斤的枪开枪了”
//        （一）添加子类：Pistol手枪类，类中有属性射程、颜色，有一个开枪的方法，输出“??颜色的手枪，射程??米，一颗子弹打出去了”
//        （二）添加子类：Shotgun猎枪类：类中有属性重量、颜色，无其他方法
//        （三）添加在类：AK47机枪类：类中有属性射程、重量，有一个开枪的方法，输出“重??公斤的AK47，射程??米，一连串弹打出去了”

//        （四）编写测试类，定义一个Gun类型的变量gun，用此变量引用一个手枪的对象，调用这把枪的开枪方法，观察输出的结果
//        （五）生成一个猎枪对象并放入到这个枪的变量gun中去，又调用这把枪的开枪方法，观察输出结果
//        （六）生成一个机枪对象并放入到这个枪的变量gun中去，又调用这把枪的开枪方法，观察输出结果

package demo01.p0428;

public class Computer {
    public double price;
    public String brand;
    public String time;

    //关机
    public void closeComputer() {
        System.out.println("正在关机");
    }

    //通电
    public void electric() {
        System.out.println("正在通电");
    }

    ;

    //正在开机
    public void open() {
        System.out.println("正在开机");
    }
}
/*5. 写一个计算机类，类中用属性价格、品牌、出厂日期：
        （一）写计算机关机的方法，要求输出“正在关机”
        （二）写计算机通电的方法，要求输出“正在通电”
        （三）写计算机开机的方法一，要求输出“正在开机”
        编写测试类，对每一个方法进行测试，要求打印出的结果能显示计算机的正常运行顺序：先【通电】再【开机】最后【关机】。
*/

package demo01.p0505.juicer;

public class Juicer {
    public double price;
    public String brand;

    public void open() {
        System.out.println("正在通电");
    }

    public void action() {
        open();
        System.out.println("正在开机");
    }

    public Juicer(String brand) {
        this.brand = brand;
    }

    public String actionJuicer(String fruits) {
        System.out.println(brand + "牌榨汁机正在榨" + fruits + "果汁");
        return fruits;
    }
}

//.写一个榨汁机类，属性：  价格，品牌。类中有方法：
//        （一）写榨汁机通电的方法，要求输出“正在通电”
//        （二）写榨汁机开机的方法，要求先输出“正在通电”然后输出“正在开机”，【也就是该方法中调用了通电的方法】
//        （三）榨汁的方法：传入不同的水果，输出“正在榨xx果汁”
//        编写测试类，对第二个和第三个方法进行测试（第一个方法不测试）！
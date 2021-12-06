package demo01.p0428;

import java.util.Scanner;

public class Juicer {
    public double price;
    public String brand;

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    public void open() {
        if (num == 1) {
            System.out.println("正在通电");
        } else {
            System.out.println("不通电");
        }
    }

    public void action() {
        if (num == 1) {
            System.out.println("正在开机");
        } else {
            System.out.println("你还没有通电,所以不能开机");
        }
    }

    public void actionJuicer() {
        if (num == 1) {
            System.out.println("正在榨豆汁！");
        } else {
            System.out.println("没通电、不开机，你就想榨汁？");
        }
    }
}
/*
4. 写一个榨汁机类，属性：价格，品牌。类中有方法：
        （一）写榨汁机通电的方法，要求输出“正在通电”
        （二）写榨汁机开机的方法，要求输出“正在开机”，【开机之前必须调用通电的方法】
        （三）榨汁的方法一：输出“正在榨豆汁！”
        编写测试类，对每一个方法进行测试！
*/

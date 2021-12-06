package demo01.p0426;

import java.util.Random;
import java.util.Scanner;

public class KnowAll {
    public String name;
    public int id;

    public static void main(String[] args) {
        KnowAll knowAll = new KnowAll();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("请输入万事通类的姓名:");
        knowAll.name = scanner.next();
        knowAll.id = random.nextInt(100) + 1;
        System.out.println("万事通类的姓名:" + knowAll.name + " 身份" + knowAll.id);
    }
}
//5.写一个[万事通]类，这个万事通有名字，有身份，拥有一台扫描器和一个扫描器，即该类具有属性:名字，id, 扫描器，随机生成器属性。请创建对象并进行测试。
package demo02.oop623.demo04;

import java.util.Scanner;

public class Control {
    //    移动方法
    public void move() {
        Airship airship = new Airship("天问");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("A:向左移动，S:向下移动，D:向右移动，W:向上移动，U:向前移动，B:向后移动，其他操作退出程序");
            System.out.print("请输入你的操作:");
            String c = scanner.next();
            switch (c) {
                case "A"://向左
                    airship.left();
                    break;
                case "S"://向下
                    airship.down();
                    break;
                case "D"://向右
                    airship.right();
                    break;
                case "W"://向上
                    airship.up();
                    break;
                case "U"://向前
                    airship.ahead();
                    break;
                case "B"://向后
                    airship.back();
                    break;
                default:
                    System.out.println("退出程序");
                    System.exit(0);
                    break;
            }
        }
    }
}

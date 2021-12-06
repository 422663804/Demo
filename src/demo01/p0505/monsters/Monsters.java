package demo01.p0505.monsters;

import java.util.Scanner;

public class Monsters {
    public String type;
    public int hp;
    public int attack;

    public void show(String name) {
        System.out.println("怪物的类型是" + type + " 姓名为" + name + " 怪物血量" + hp + " 怪物攻击力为:" + attack);
    }

    public void place() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入巡逻的地点:");
        String place = input.next();
        System.out.println(type + "怪物正在" + place + "巡逻");
    }
}

//6. 思考题：写一个怪物类，有属性：怪物类型，怪物血量，怪物攻击力，
//方法1：展示信息，输出怪物的所有属性信息，
//方法2：巡逻，要求传入地点，输出怪物正在此地点巡逻。
//创建一个主类做测试，该主类视为一个游戏场景，创建8个怪物，循环输出怪物的信息。（提示：调用怪物的展示信息方法即可。）
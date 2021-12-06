package demo02.oop609.demo06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    public String name;
    private int grade = 25;
    private int i = 3;

    public Player(int grade, int i) {
        this.grade = grade;
        this.i = i;
    }

    public Player() {

    }

    public int getGrade() {
        return grade;
    }

    public int getI() {
        return i;
    }

    public String[] skillsTree = new String[8];

    //    获取信息
    public void show() {
        skillsTree[0] = "闪现";
        skillsTree[1] = "净化";
        skillsTree[2] = "治疗";
        System.out.println("玩家名称:" + name + "所有技能为" + Arrays.toString(skillsTree));
    }

    //    学习新技能
    public void stuSkills() {
        if (grade <= 30) {
            grade++;
            Player player = new Player();
            player.killAnimal();
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入你要学习的技能:");
            skillsTree[i] = scanner.next();
            System.out.println("学习技能成功!" + Arrays.toString(skillsTree));
            i++;
        } else {
            System.out.println("你已经达到巅峰等级，无法再学习新技能");
        }
    }

    //    打怪升级
    public void killAnimal() {
        Random random = new Random();
        if (grade <= 30) {
            grade++;
            System.out.println("打怪升级成功！当前等级为" + grade);
        }
    }
}
//写一个游戏类，有属性：名称、当前玩家、游戏支持的技能数组，
//有方法：start开始游戏（初始化当前的玩家、游戏技能以及玩家附带1-2个基础技能）、play玩游戏（玩家打怪升级、升级后随机学习新技能）、quit退出游戏（保存，退出）。
//
//写一个玩家类：有属性：名字、等级、技能树（最多拥有8个技能，默认没有，所有技能为null），
//有方法：获取信息（打印玩家名字、所有有效技能的描述等）、学习新技能（根据等级要求可能成功、失败）、打怪升级（随机释放技能，释放成功等级提升、否则等级不变）。
//
//写一个技能类，有属性：名字、最低等级要求，
//有方法：技能特效描述、释放技能。 请设计以上类和测试。
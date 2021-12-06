package demo02.oop609.demo06;

import java.util.Arrays;
import java.util.Scanner;

public class FunPlay extends Player {
    private String name; //游戏名称
    private String playName; //当前玩家
    private String[] skills; //游戏支持的技能数组
    public int i = 0;


    public FunPlay(String name, String playName, String[] skills) {
        super();
        this.name = name;
        this.playName = playName;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    //    开始游戏
    public void start() {
        System.out.println("玩家初始信息");
        System.out.println("FunPlay{" + "name='" + name + '\'' + ", playName='" + playName + '\'' + ", skills=" + Arrays.toString(skills) + '}');
    }

    //    玩游戏
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("打怪升级成功！！！");
        System.out.print("请输入你想学习的技能:");
        i++;
        int k = getGrade() + 1;
        skillsTree = new String[8];
        for (int j = 0; j < skills.length; j++) {
            skillsTree[j] = skills[j];
        }
        skillsTree[skills.length - 1 + i] = scanner.next();
        System.out.println("经过打怪升级后学习的技能组为" + Arrays.toString(skillsTree));
    }

    //    退出游戏
    public void quit() {
        System.out.println("存档成功");
    }
}
//写一个游戏类，有属性：名称、当前玩家、游戏支持的技能数组，
//有方法：start开始游戏（初始化当前的玩家、游戏技能以及玩家附带1-2个基础技能）、play玩游戏（玩家打怪升级、升级后随机学习新技能）、quit退出游戏（保存，退出）。
package demo02.oop609.demo06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FunPlay funPlay = new FunPlay("摩尔庄园", "打豆豆的熊", new String[]{"闪现", "净化"});
        Player player = new Player();
        Skills skills = new Skills();
        player.name = "张三";
        player.skillsTree = new String[8];
        System.out.println("**********************");
        System.out.println("------1:开始游戏-------");
        System.out.println("------2:玩游戏---------");
        System.out.println("------3:保存信息-------");
        System.out.println("------4:展示玩家-------");
        System.out.println("------5:学习新技能------");
        System.out.println("------6:打怪升级-------");
        System.out.println("------7:技能特效描述-------");
        System.out.println("------0:结束游戏-------");
        System.out.println("**********************");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你的选择:");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    funPlay.start();
                    break;
                case 2:
                    funPlay.play();
                    break;
                case 3:
                    funPlay.quit();
                    break;
                case 4:
                    player.show();
                    break;
                case 5:
                    player.stuSkills();
                    break;
                case 6:
                    player.killAnimal();
                    break;
                case 7:
                    skills.showSkills();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入有误!");
                    break;
            }
        }
    }
}

package demo02.oop609.demo05;

import java.util.Random;

public class Player {
    public String player;
    public int x;
    public int y;

    public void getAddress() {
        Random random = new Random();
        x = random.nextInt(5);
        y = random.nextInt(5);
        int row = 0;
        int col = 0;
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (x == i && j == y) {
                    row = x;
                    col = y;
                    break;
                }
            }
        }
        System.out.println("玩家的x坐标为:" + row + " 玩家的y坐标为:" + col);
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.getAddress();
    }
}
//我们知道方法只能返回一个值，游戏中的坐标通常有两个值，一个x一个y，
// 创建一个游戏类，有玩家属性，有方法：获取玩家当前坐标，要求该方法得到玩家的坐标，请设计相关类和属性、方法。
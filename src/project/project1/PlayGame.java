package project.project1;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入游戏的基本信息
        System.out.print("请输入地图的尺寸:");
        int size = input.nextInt();
        int[][] array = new int[size][size];
        System.out.print("请输入玩家的初始位置x坐标:");
        int playRow = input.nextInt();
        System.out.print("请输入玩家的初始位置y坐标:");
        int playCol = input.nextInt();
        System.out.print("请设置目标位置x坐标:");
        int z = input.nextInt();
        System.out.print("请设置目标位置y坐标:");
        int k = input.nextInt();
        System.out.println("目标位置为" + "[z=" + z + ",k=" + k + "]");
        System.out.print("请设置最大步数:");
        int max = input.nextInt();

        //固定盒子的位置
        int boxRow = 1; //行
        int boxCol = 1; //列

        //初始坐标 0-移动区域，1-玩家，2-目标，3-盒子，
        array[playRow][playCol] = 1;
        array[k][z] = 2;
        array[boxRow][boxCol] = 3;

        //打印地图  将上面输入的地图信息打印出来
        for (int[] ints : array) { //打印行
            for (int anInt : ints) { //打印行列
                switch (anInt) {
                    case 1:
                        System.out.print("✰");
                        break;
                    case 2:
                        System.out.print("❤");
                        break;
                    case 3:
                        System.out.print("☒");
                        break;
                    case 0:
                        System.out.print("口");
                        break;
                }
            }
            System.out.println();
        }

        System.out.println("游戏开始!");
        //移动箱子
        int count = 0; //统计移动步数
        while (true) {
            System.out.print("请移动(A-左，D-右，W-上，S-下，Z-退出):");
            String move = input.next();
            int oldPlayerRow = playRow;
            int oldPlayerCol = playCol;
            switch (move) {
                case "W":
                    if (playRow > 0) {
                        playRow--;
                        if (playCol == boxCol && playRow == boxRow) {
                            if (boxRow > 0) {
                                boxRow--;
                            } else {
                                playRow++;
                            }
                        }
                        count++;
                    }
                    break;
                case "S":
                    if (playRow < array.length - 1) {
                        playRow++;
                        if (playCol == boxCol && playRow == boxRow) {
                            if (boxRow < array.length - 1) {
                                boxRow++; //列--
                            } else {
                                playRow--;
                            }
                        }
                    }
                    count++;
                    break;
                case "A":
                    if (playCol > 0) {
                        playCol--;
                        if (playCol == boxCol && playRow == boxRow) {
                            if (boxCol > 0) {
                                boxCol--;
                            } else {
                                playCol++;
                            }
                        }
                        count++;
                    }
                    break;
                case "D":
                    if (playCol < array.length - 1) {
                        playCol++;
                        if (playCol == boxCol && playRow == boxRow) {
                            if (boxCol < array.length - 1) {
                                boxCol++;
                            } else {
                                playCol--;
                            }
                        }
                        count++;
                    }
                    break;
            }
            //将新地图打印 将旧玩家赋值为地图
            array[oldPlayerRow][oldPlayerCol] = 0;
            array[playRow][playCol] = 1;
            array[boxRow][boxCol] = 3;
            for (int[] ints : array) { //打印行
                for (int anInt : ints) { //打印行列
                    switch (anInt) {
                        case 1:
                            System.out.print("✰");
                            break;
                        case 2:
                            System.out.print("❤");
                            break;
                        case 3:
                            System.out.print("☒");
                            break;
                        case 0:
                            System.out.print("口");
                            break;
                    }
                }
                System.out.println();
            }
            //取得胜利的条件
            if (boxRow == z && boxCol == k) {
                System.out.println("恭喜你获得胜利!");
                System.out.println("玩家走了" + count + "步");
                break;
            }
        }
    }
}
/*
目标：创建一个Java搬箱子小游戏。
        描述：使用二维数组创建地图，通过输入上下左右移动箱子，关卡地图设置箱子起始位置和目标位置，设置障碍物，
        在规定步数的前提下箱子移动到目标位置表示胜利，否则步数用完表示失败。
        □□□□□□□□
        □□□□□□□□
        □□□■□□□□ <-玩家，上下左右移动，不能移到外面
        □□□□□□□□
        □□□□□□□□
        □□□□□□□□
        □□□□□★□□ <-目标
        □□□□□□□□

        使用Java项目完成。*/

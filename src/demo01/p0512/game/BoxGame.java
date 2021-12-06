package demo01.p0512.game;

public class BoxGame {
    //属性
    public int row;
    public int col;
    public int playerRow; //玩家
    public int playerCol;
    public int boxRow; //推动的盒子
    public int boxCol;
    public int targetRow; //目标
    public int targetCol;
    public int step; //步数
    public int maxStep; //最大步数
    public int[][] map; //地图

    //初始化地图
    public void init() {
        map = new int[row][col];
        map[playerRow][playerCol] = 1; //玩家
        map[boxRow][boxCol] = 2; //推动的箱子
        map[targetRow][targetCol] = 3; //目标
    }

    //游戏是否成功
    public void success() {
        if (targetRow == boxRow && targetCol == boxCol) {
            System.out.println("恭喜你,获得胜利!");
            System.exit(0);
        }
    }

    //游戏是否失败
    public void fail() {
        if (boxRow == map[0][0] || boxRow == map[0][row - 1] || boxRow == map[row - 1][0] || boxRow == map[row - 1][col - 1] || maxStep > 20) {
            System.out.println("游戏失败");
            System.exit(0);
        }
    }


    //移动  保存
//    public String move(String move){
//
//    }

    //上下左右方法（4个）

    //更新地图

    //打印地图
    public void printMao() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                switch (map[i][j]) {
                    case 1:
                        System.out.print("✰");
                        break;
                    case 2:
                        System.out.print("☒");
                        break;
                    case 3:
                        System.out.print("❤");
                        break;
                    default:
                        System.out.print("口");
                        break;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BoxGame boxGame = new BoxGame();
        boxGame.row = 6;
        boxGame.col = 6;
        boxGame.boxRow = 3;
        boxGame.boxCol = 3;
        boxGame.playerRow = 0;
        boxGame.playerCol = 0;
        boxGame.targetRow = 5;
        boxGame.targetCol = 5;
        boxGame.maxStep = 20;
        boxGame.init();
        boxGame.printMao();
    }
}

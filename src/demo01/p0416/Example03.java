package demo01.p0416;

public class Example03 {
    public static void main(String[] args) {
        String square = "□";
        String star = "☆";
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 3 && j == 4) {
                    System.out.print(star);
                } else {
                    System.out.print(square);
                }
            }
            System.out.println();
        }
    }
}
/*
3. 打印如下游戏地图，其中五角星为玩家位置，玩家位置随机（行、列两个位置），玩家不能在地图之外，比如玩家位置是3行4列：
        □□□□□□
        □□□□□□
        □□□☆□□
        □□□□□□
        □□□□□□
        □□□□□□
*/

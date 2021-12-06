package demo01.p0519;

public class Demo03 {
    public static void main(String[] args) {
        boolean[][] array = new boolean[5][5];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                boolean result = i == 1 && (j == 4 || j == 1) || i == 2 && (j == 0 || j == 1) || i == 3 && (j == 0 || j == 1 || j == 2 || j == 4) || i == 4 && (j == 2 || j == 3 || j == 4);
                if (result) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("手机袋里面一共有" + count + "台手机");
    }
}
//下图表示正方形手机袋收到的手机，#表示有，*表示无，
//        请使用布尔类型的二维数组定义并打印手机情况和个数。
//        # # # # #
//        # * # # *
//        * * # # #
//        * * * # *
//        # # * * *

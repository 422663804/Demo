package demo01.p0423;

public class Test {
    // 二维数组逆序
    public static void main(String[] args) {
        int[][] old = { { 31, 32, 48, 37 }, { 41, 30, 97, 73 }, { 13, 34, 92, 37 } };
        int[][] newa = new int[3][4];
        for (int i = old.length - 1; i >= 0; i--) {
            for (int j = old[i].length -1; j >= 0; j--) {
                newa[old.length - 1 - i][old[i].length - 1 - j] = old[i][j];
            }
        }
        System.out.println("-----------------");
        for (int[] row : newa) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

package demo01.p0423;

public class Example01 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {3, 2, 1}, {0, 0, 0}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//1. 创建一个二维整数数组，3行3列，第一列值1,2,3，第二列3,2,1，第三列0,0,0，循环输出数组每一个元素。
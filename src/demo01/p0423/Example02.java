package demo01.p0423;

public class Example02 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {3, 2, 1}, {0, 0, 0}};
        for (int i = array.length - 1; i >= 0; i--) { //从最后一行开始打印输出
            for (int j = array[i].length - 1; j >= 0; j--) { //最后一行最后一个元素打印输出
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
//2. 逆序输出第1题中的数组的每一个元素。
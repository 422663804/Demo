package demo01.p0607;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//1. 打印如下数字图形：
//        9
//        9 8
//        9 8 7
//        9 8 7 6
//        9 8 7 6 5
//        9 8 7 6 5 4
//        9 8 7 6 5 4 3
//        9 8 7 6 5 4 3 2
//        9 8 7 6 5 4 3 2 1
package demo01.p0412;

public class Example06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 7 == 0) {
                continue;
            } else {
                System.out.print(" " + i);
            }
        }
    }
}
//要求使用continue:循环输出1-15，如果遇到被7整除数字则不输出，并继续下一个数字

package demo01.p0414;

public class Example03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
        打印如下图形:
        *
       ** *
      *** **
     **** ***
    ***** ****
*/

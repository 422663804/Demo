package demo01.p0416;

public class Example05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j * j * j) {
                    System.out.println(i + "是立方数，是" + j + "的立方");
                }
            }
        }
    }
}

      /*
      5. 求出1-10000以内所有立方数（比如1和8就是立方数，1=1x1x1，8=2x2x2）
      */
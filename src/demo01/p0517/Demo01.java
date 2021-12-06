package demo01.p0517;

public class Demo01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 7 != 0) {
                count++;
            }
        }
        System.out.println("count=" + count);
    }
}
//1.	统计1000以内能被3整除但是不能被7整除的数字之和。
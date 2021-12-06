package demo01.p0517;

public class Demo05 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = new int[100];
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        for (int k : array) {
            for (int i : array2) {
                sum += k * i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
//假设两组数相乘，得到的结果是两组数的数字分别单独相乘，比如[1,2]x[3,4]=1x3+1x4+2x3+2x4，
//        请计算[1,2,3]x[1,2,3,4...100]的结果。

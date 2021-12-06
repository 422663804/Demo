package demo01.p0521;

public class Demo03 {
    public static void main(String[] args) {
        int[] array = new int[18];
        int sum = 0;
        for (int i = 801; i <= 818; i++) {
            array[i - 801] = i;
        }
        for (int j : array) {
            sum += j;
        }
        System.out.println("sum=" + sum);
    }
}
//某旅馆楼层房号从801到818总共18间房，请使用数组把所有房号记录下来，并计算房号的和。
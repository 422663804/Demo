package demo01.p0526;

public class Demo05 {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 1, 3, 6, 2, 0, 1};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]);
        }
        int num = Integer.parseInt(String.valueOf(str));
        System.out.println(num);
    }
}
//5. 有一个整数的各个位数存储在一个数组中{1,4,5,6,1,3,6,2,0,1}，请打印该整数。

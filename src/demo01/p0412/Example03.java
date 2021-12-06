package demo01.p0412;

public class Example03 {
    public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) { //循环遍历范围100-999的数字
            int i = n % 10; //个位数
            int j = n / 10 % 10; //十位数
            int k = n / 100 % 10; //百位数
            int num = (int) Math.pow(i, 3); //Math.pow(底数,几次方) 也就是说该数为i的3次方
            int num2 = (int) Math.pow(j, 3);
            int num3 = (int) Math.pow(k, 3);
            if (n == num + num2 + num3) {
                System.out.println(" " + n);
            }
        }
    }
}
//要求使用for循环:打印出100-999所有的水仙花数”，所谓"水仙花数”是指一个三位数， 其各位数字立方和等于该数本身。

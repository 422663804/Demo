package demo01.p0602;

public class Demo02 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println(sum);
    }
}
//1. 猴子摘了一堆枣N个，第一天吃了一半，还嫌不过瘾，又多吃了一个：第二天又吃了剩下的一半零一个：
//        以后每天如此，到第十天，猴子一看只剩下一个了。问最初有多少个枣子?
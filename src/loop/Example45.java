package loop;

public class Example45 {
    public static void main(String[] args) {
        for (int i = 0; i < 35; i++) {
            int j = 35 - i;
            if (i * 2 + j * 4 == 94) {
                System.out.println("鸡有" + i + "\t兔有" + j);
            }
        }
    }
}
/*
 题目分析： 鸡兔同笼问题：35个头，94只脚，请问鸡和兔各多少只？
 1、变量有鸡、兔 、(头、脚)已定
 2、鸡有2只脚 兔有4只脚 头都是一个
 3、循环 判断
*/

package loop;

public class Example22 {
    public static void main(String[] args) {
        char a = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("\t" + a);
                a = (char) (a + 1);
            }
            System.out.println();
        }
     /*   int a = 1;
        for (int i = 0; i < 5; i++) { //5行
            for (int j = 0; j < 5; j++) {  //5列
                System.out.print("\t" + a);
                a += 1;
            }
            System.out.println();
        }*/
    }
}
/*
    1. 打印如下字母图：
        a b c d e
        f g h i j
        k l m n o
        p q r s t
        u v w x y
分析：
1、可以用输出语句、可以用循环（最好） 内循环控制5行 外循环控制5列输出
2、每行有5位数字 即规定了每行的长度
3、输出的是25位小写字母
*/

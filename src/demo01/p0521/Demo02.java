package demo01.p0521;

public class Demo02 {
    public static void main(String[] args) {
        char result = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(result);
                result++;
            }
            System.out.println();
        }
    }
}
//打印如下字母图：
//        a b c d e
//        f g h i j
//        k l m n o
//        p q r s t
//        u v w x y

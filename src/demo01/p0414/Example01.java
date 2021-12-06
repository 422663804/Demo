package demo01.p0414;

public class Example01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("第" + i + "头羊");
            System.out.print("---饲料---");
            for (int j = 1; j <= 13; j++) {
                System.out.print("\t" + j);
            }
            sum+=13;
            System.out.println();
        }
        System.out.println("一共数了10头羊，用了"+sum+"包饲料");
    }
}
/*
使用二重循环数羊，共10头，每数完一头羊需要从仓库数出13袋饲料 (即输出1-10即可)
*/

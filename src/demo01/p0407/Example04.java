package demo01.p0407;
//4. 改用do...while循环做上一题

public class Example04 {
    public static void main(String[] args) {
        int i = 10;
        do {
            if (i%5==0){
                System.out.print("\t"+i);
            }
            i++;
        }while (i<=100);
    }
}

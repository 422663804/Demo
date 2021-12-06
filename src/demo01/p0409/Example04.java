package demo01.p0409;

public class Example04 {
    public static void main(String[] args) {
        for (int i = 10000;i<=99999;i++ ){
            if (i%10==i/10000%10){
                System.out.print("\t"+i);
            }else if (i/10%10==i/1000%10){
                System.out.print("\t"+i);
            }
        }
    }
}
/*
4.输出10000-99999里面的所有回文数。说明：12521、46864是回文数，个位与万位相同，十位与千位相同。

*/

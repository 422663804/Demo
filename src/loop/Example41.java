package loop;

import java.util.Scanner;

public class Example41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int m = scanner.nextInt();
        if (m > 0) {
            int sum = 0;
            for (int i = 0; i <= m; i++) {
                sum+=i;
                if (sum==m) {
                    System.out.println("和数"+m);
                    return;
                }else if (sum>m){
                    System.out.println("不是和数"+m);
                    return;
                }
            }
        } else {
            System.out.println("您输入的数字非正整数，请从新输入");
            m = scanner.nextInt();
        }

    }
}
/*
 从控制台输入一个正整数，判断该正整数是否为“和数”， 即m=n+(n-1)+(n-2)+...+1，比如10=4+3+2+1为和数。
1、控制台输入一个正整数
2、循环+判断
*/

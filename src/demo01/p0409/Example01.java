package demo01.p0409;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("练习题做完了，咨询老师是否答对了，老师回答道：");
        String i = scanner.next();
        do {
            if (i.equals("no")) {
                System.out.println("小伙子，继续努力");
                i = scanner.next();
            }
        } while (!i.equals("yes"));
        System.out.println("优秀");
    }
}
/*
1.小明做完Java习题需要询问老师是否答对，如果老师回答是"no"那么就要继续答题，直到答对为止。（要求使用do...while）

*/

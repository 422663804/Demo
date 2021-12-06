package demo01.p0326;

import java.util.Scanner;

/*6. 从控制台输入张三的Java成绩和音乐成绩，最后输出他是否有奖励(true/false)，奖励条件是：【张浩Java成绩大于98分，而且音乐成绩大于80分】
 ，老师奖励他，或者【Java成绩等于100分，音乐成绩大于70分】，老师也可以奖励他*/
public class Example06 {
    public static void main(String[] args) {
        System.out.println("请输入张三的Java成绩和音乐成绩");
        Scanner scanner5 = new Scanner(System.in);
        int i = scanner5.nextInt();
        int j = scanner5.nextInt();
        if (i>98&&j>80){
            System.out.println("true");
        }else if (i==100&&j>70){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

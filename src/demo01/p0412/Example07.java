package demo01.p0412;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        int sum=0;
        for (int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"位学生成绩：");
            double ach = sc02.nextDouble();
            if (ach<0){
                continue;
            }
            sum+=ach;
        }
        System.out.println("学生的总成绩为"+sum+"分");
    }
}
//要求使用continue:循环接收5名学生的成绩并累加，如果遇到负分数则不计入总分，最后输出统计后的总成绩

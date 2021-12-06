package demo01.p0412;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int sum=0;
        for (int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"位学生成绩：");
            double ach = sc01.nextDouble();
            if (ach<0){
                System.out.println("成绩输入有误！，总共录入了"+(i-1)+"名学生成绩，总分数为"+sum+"分");
                break;
            }
            sum+=ach;
        }
        System.out.println("学生的总成绩为"+sum+"分");
    }
}
//要求使用break:循环从控制台接收5名学生的成绩，如果遇到负分数则退出，最后输出总成绩

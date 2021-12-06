package demo01.p0331;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生的体育成绩:");
        double score = input.nextDouble();
        System.out.print("请输入学生的性别:");
        String gender = input.next();
        if (score > 85) {
            if (gender.equals("女")) {
                System.out.println("恭喜你，进入女子组");
            } else {
                System.out.println("恭喜你，进入男子组");
            }
        } else {
            System.out.println("继续努力");
        }
    }
}
//3. 从控制台输学生的体育成绩以及性别，如果成绩大于85且是女子，则进入女子组，否则进入男子组，如果成绩低于85则输出继续努力。
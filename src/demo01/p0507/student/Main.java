package demo01.p0507.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        ClassStu stu = new ClassStu();

        stu.allaySut = new Student[2];
        for (int i = 0; i < stu.allaySut.length; i++) {
            System.out.println("---请输入第" + (i + 1) + "位学生的信息---");
            stu.allaySut[i] = new Student();
            System.out.print("请输入姓名:");
            stu.allaySut[i].name = input.next();
            System.out.print("请输入性别:");
            stu.allaySut[i].gender = input.next();
            System.out.print("请输入成绩:");
            stu.allaySut[i].score = input.nextInt();
            System.out.print("请输入年龄:");
            stu.allaySut[i].age = input.nextInt();
        }
        stu.age();
        stu.sumScore();
        stu.scale();
        stu.getInfo();
        stu.find("张三");
    }
}

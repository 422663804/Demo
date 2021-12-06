package demo01.p0602.stu;

import java.util.Scanner;

public class Student {
    private String className;
    private int numId;
    private String name;
    private double score;

    public void show() {
        System.out.println("className=" + className + " numId=" + this.numId + " name=" + name + " score=" + score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student stu2 = new Student();
        Student[] stu = new Student[3];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的信息");
            stu2 = new Student();
            System.out.print("请输入您的班级:");
            stu2.className = scanner.next();
            System.out.print("请输入您的学号:");
            stu2.numId = scanner.nextInt();
            System.out.print("请输入您的姓名:");
            stu2.name = scanner.next();
            System.out.print("请输入您的总成绩:");
            stu2.score = scanner.nextDouble();
            stu[i] = stu2;
        }
        for (Student student : stu) {
            student.show();
        }
    }
}
//1. 创建一个类表示学生，有班级、学号、分数、姓名等属性，有信息展示的方法，
//        在测试类中创建一个学生类数组，长度为3，分别输出其信息。
package demo01.p0519;

import java.util.Scanner;

public class Student {
    public String[] stuName;

    public static void main(String[] args) {
        Student student = new Student();
        student.stuName = new String[]{"张三", "李四", "王五"};
        System.out.print("请输入学生的姓名:");
        String name = new Scanner(System.in).next();
        for (int i = 0; i < (student.stuName).length; i++) {
            if ((student.stuName)[i].equals(name)) {
                System.out.println("该学生在这班集体中");
            }
        }
    }
}
// 写一个简单的班级类，类有一个属性为学生姓名数组，写一个方法，传入一个学生姓名寻找该学生是否在班集体。

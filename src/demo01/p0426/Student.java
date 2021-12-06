package demo01.p0426;

public class Student {
    public String name;
    public double java;
    public double sql;
    public double c;

    public static void main(String[] args) {
        double average;
        Student student = new Student();
        student.name = "张三";
        student.java = 99;
        student.sql = 99;
        student.c = 99;
        average = (student.java + student.sql + student.c) / 3;
        System.out.println("学生的姓名:" + student.name + " 平均成绩" + average);
    }
}
//3.	写一个学生的类，类中的属性:学生的名字，java成绩， sq1成绩，C#成绩，写入口测试类，生成几个学生对象，赋值成绩，最后输出每一个学生的姓名和平均成绩
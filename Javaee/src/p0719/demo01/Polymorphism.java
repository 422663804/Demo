package p0719.demo01;

public class Polymorphism {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Undergraduate("张三");
        student[1] = new Undergraduate("李四");
        student[2] = new Postgraduate("Tom");
        student[3] = new Undergraduate("Jack");
        student[4] = new Postgraduate("小天");
        for (int i = 0; i < student.length; i++) {
            student[i].setCourseScore(0, 89);
            student[i].setCourseScore(1, 90);
            student[i].setCourseScore(2, 78);
        }
        for (int i = 0; i < student.length; i++) {
            student[i].calculateGrade();
        }
        System.out.println("姓名\t" + "类型\t" + "成绩");
        System.out.println("------------------------");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t" + student[i].getType() + "\t" + student[i].getCourseGrade());
        }
    }
}

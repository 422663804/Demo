package p0719.demo01;

public class Postgraduate extends Student{
    public Postgraduate(String name) {
        super(name);
        setType("研究生");
    }

    @Override
    public void calculateGrade() {
        int total = 0;//成绩
        double average = 0;
        for (int i = 0; i < CourseNo; i++) {
            total += getCourses()[i];
        }
        average = total / CourseNo;
        if (average >= 90 && average <= 100) {
            setCourseGrade("优秀");
        } else if (average >= 80 && average < 90) {
            setCourseGrade("良好");
        } else if (average >= 70 && average < 80) {
            setCourseGrade("中等");
        } else if (average >= 60 && average < 70) {
            setCourseGrade("及格");
        } else {
            setCourseGrade("不及格");
        }
    }
}

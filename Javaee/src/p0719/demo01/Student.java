package p0719.demo01;

abstract class Student {
    public static int CourseNo = 3;
    private String type;
    private String name;
    private int[] courses; //课程
    private String courseGrade;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        courses = new int[CourseNo];
        courseGrade = null;
    }

    public abstract void calculateGrade();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getCourses() {
        return courses;
    }

    public void setCourses(int[] courses) {
        this.courses = courses;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public int getCourseScore(int courseNumber) {
        return courses[courseNumber];
    }

    public void setCourseScore(int courseNumber, int courseScore) {
        this.courses[courseNumber] = courseScore;
    }
}

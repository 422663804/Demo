package demo01.p0505.student;

class Student {
    public String name;
    public double java;
    public double sql;
    public double c;

    public void study() {
        System.out.println(name + "学生在学习");
    }

    public double course(double sum) {
        return sum;
    }

    public double averageCourse(double average) {
        System.out.println(name + "功课平均分average=" + average);
        return average;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "天天";
        student.java = 88;
        student.sql = 89;
        student.c = 90;
        student.study();
        double sum = student.java + student.sql + student.c;
        double result1 = student.course(sum);
        double result = student.averageCourse(result1 / 3);
    }
}

//2. 写一个学生的类，类中的属性学生的名字，学生的java成绩，学生的sql成绩，学生的C成绩。类中有方法：
//        （一）学生学习的方法，无返回，要求输出“学生在学习”。
//        （二）返回学生所有功课总成绩的方法。
//        （三）返回学生把有功课平均分的方法。（提示：可以利用方法二）

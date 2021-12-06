package demo02.oop618.demo02;

public class TestStu {
    public static void main(String[] args) {
        Student student = new Student("张三", 90);
        Clazz clazz = new Clazz();
        clazz.addStu();
        System.out.println(clazz.get(2));
        System.out.println(clazz.get("张三"));
        student.show();
    }
}

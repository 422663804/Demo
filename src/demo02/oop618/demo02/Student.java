package demo02.oop618.demo02;

public class Student {
    private String name;
    private double achievement;
    private int index;

    public Student(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Student() {
    }

    public Student(String name, double achievement) {
        this.name = name;
        this.achievement = achievement;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAchievement() {
        return achievement;
    }

    public void setAchievement(double achievement) {
        this.achievement = achievement;
    }

    public void show() {
        System.out.println("------------------------");
        System.out.println("学生的姓名是" +getName() + " 成绩为" + getAchievement());
    }
}
//编写学生(Student)类，有属性姓名和成绩，有展示信息的方法；
//        编写一个班级(Clazz)类，类中有属性：存放 5 个学生的数组，当前学生总人数；有方法：一个向班级中添加学生，两个得到学生的方法：
//        （1）通过下表获取学生对象：public Student get(int index);
//        （2）通过学生名字获取学生：public Student get(String name);
//        编写测试类进行测试。

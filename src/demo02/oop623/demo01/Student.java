package demo02.oop623.demo01;

public class Student {
    private String name;
    private int age;
    private double achievement;
    private char sex;
    private boolean graduation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAchievement() {
        return achievement;
    }

    public void setAchievement(double achievement) {
        this.achievement = achievement;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isGraduation() {
        return graduation;
    }

    public void setGraduation(boolean graduation) {
        this.graduation = graduation;
    }
}
//1. 写一个符合JavaBean规范的Student学生类，属性分别是：姓名、年龄、成绩、性别、是否毕业等，使用IDEA或者Eclipse工具生成对应的getter和setter方法。

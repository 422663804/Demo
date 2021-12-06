package demo02.oop618.demo02;

import java.util.Scanner;

public class Clazz {
    private Student[] array = new Student[5];

    public Clazz() {
    }

    public Clazz(Student[] array) {
        this.array = array;
    }

    public Student[] getArray() {
        return array;
    }

    public void setArray(Student[] array) {
        this.array = array;
    }

    public void addStu() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student();
            System.out.print("请输入第" + (i + 1) + "学生姓名:");
            array[i].setName(scanner.next());
            System.out.print("请输入学生的成绩:");
            array[i].setAchievement(scanner.nextDouble());
        }
        System.out.println("------------------------");
        int i = 0;
        while (i < array.length) {
            System.out.println("姓名:" + array[i].getName() + "  成绩:" + array[i].getAchievement() + "  ");
            i++;
        }
    }

    public Student get(int index) {
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                System.out.println("第" + index + "位学生的姓名是" + array[i].getName() + " 成绩为" + array[i].getAchievement());
                break;
            } else if (index < 0 || this.array.length <= index) {
                return null;
            }
        }
        return this.array[index];
    }

    public Clazz get(String name) {
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().equals(name) && array.length != 0) {
                System.out.println("该班有该位学生,学生的姓名为:" + array[i].getName() + " 成绩为" + array[i].getAchievement());
            }
        }
        return this;
    }
}
//编写学生(Student)类，有属性姓名和成绩，有展示信息的方法；
//        编写一个班级(Clazz)类，类中有属性：存放 5 个学生的数组，当前学生总人数；
//        有方法：一个向班级中添加学生，两个得到学生的方法：
//        （1）通过下表获取学生对象：public Student get(int index);
//        （2）通过学生名字获取学生：public Student get(String name);
//        编写测试类进行测试。


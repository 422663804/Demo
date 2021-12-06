package demo02.oop609.demo01;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void run() {
        System.out.println(name + "正在跑步");
    }

    @Override
    public String toString() {
        return name + "的年龄是" + age;
    }
}
//1. 写一个人类，类中有属性：姓名，年龄。有方法：
//        （一）无参，无返回方法：跑步，要求要此方法中输出“xxx正在跑步”。
//        （二）无参，有返回方法：toString（介绍方法），要求返回“xxx的年龄是：xxx”。
//        写一个测试类，生成一个小红对象，年龄10。然后使用介绍方法输出这个人的信息。

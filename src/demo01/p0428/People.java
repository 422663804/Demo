package demo01.p0428;

public class People {
    public static void main(String[] args) {
        TestPeople people = new TestPeople();
        people.name = "麻子";
        people.age = 18;
        people.gender = "男";
        people.show();
    }
}

class TestPeople {
    public String name;
    public int age;
    public String gender;
    public void show() {
        System.out.println("name=" + name + " age=" + age + " gender=" + gender);
    }
}
/*
写一个人的类，类中有属性：姓名、年龄、性别。有一个展示自我信息的方法。写一个测试类，
测试类具体要求为：定义一个人类的对象变量a，生成一个人的对象放入到a变量中去，将此人的姓名赋值为“麻子”，年龄为18，性别为'男'。
调用展示自我信息方法以显示a的信息。*/

package demo02.oop616.demo02;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String address;

    public Student() {
        this.name = "张三";
        this.sex = '男';
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void disPlay() {
        System.out.println("姓名:" + name + " 性别:" + sex + " 年龄:" + age + "家庭地址:" + address);
    }
}
//将你自己的个人信息封装成一个Student类，属性：姓名name、性别sex、年龄age、家庭地址address；实现方法display()用于显示这些信息。要求：
//        （一）带无参默认构造方法
//        （二）带多个参数的构造方法，参数包括名字、性别、年龄
//        （三）带多个参数的构造方法，参数包括名字、性别
//        （四）带多个参数的构造方法，参数包括名字
//        （五）无参构造方法中必须访问有参构造方法（参数值随意）


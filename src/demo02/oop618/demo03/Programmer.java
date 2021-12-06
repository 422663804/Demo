package demo02.oop618.demo03;

public class Programmer {
    private String name;
    private int age;
    private String language;
    private String workAddress;

    public Programmer() {
    }

    public Programmer(String name, int age, String language, String workAddress) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.workAddress = workAddress;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    //    编程
    public void program() {

    }

    //    学习
    public void study() {

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", workAddress='" + workAddress + '\'' +
                '}';
    }
}
//3. 编写一个程序员类，属性：名字、年龄、所用编程语言、单位等；方法：编程、学习等。
//        添加程序员子类，菜鸟程序员，有方法：复制粘贴；
//        添加程序员子类，大佬程序员，有方法：明捷开发；
//        添加程序员子类 佛系程序员，有方法：打坐；
//        添加程序员子类 程序媛，无其他方法；
//        添加大佬程序员子类 资深架构师，有方法：打磨框架；
//        添加大佬程序员子类 高级黑客，有方法：黑灯瞎火搞事情。

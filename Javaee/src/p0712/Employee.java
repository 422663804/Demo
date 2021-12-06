package p0712;

public class gitEmployee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.name); //当前的名字比较对象里的名字
        }
        throw new NullPointerException("传入的数值有误");
    }
}
//1.定义一个Employee类。
//        该类包含: private 成员变量name,age,birthday, 其中birthday 为MyDate类的对象;
//        并为每一个 属性定义getter, setter方法;
//        并重写toString 方法输出name, age, birthdays
//        MyDate类包含:
//        private成员变量year,month,day;并为每一个属性定义getter, setter方法;
//        创建该类的5个对象，并把这些对象放入TreeSet集合中(下一章:TreeSet需使用泛型来定义)
//        分别按以下两种方式对集合中的元素进行排序，并遍历输出:
//        1).使Employee实现Comparable 接口，并按name排序。
//        2).创建TreeSet 时传入Comparator 对象，按生日日期的先后排序。

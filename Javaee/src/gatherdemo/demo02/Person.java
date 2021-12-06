package gatherdemo.demo02;
/*
在HashSet集合中添加三个Person对象，把姓名相同的人当作同一个人，禁止重复添加。
提示：Person类中定义name和age属性，重写hashCode()方法和equals()方法，针对Person类的name属性进行比较，
如果name相同，hashCode()方法的返回值相同，equals()方法返回true
 */

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //hashCode和equals进行name的比较就好了
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Person))
            return false;
        Person person = (Person) o;
        return person.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

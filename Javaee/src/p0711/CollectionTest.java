package p0711;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void test01() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tian"));
        coll.add(new Person("张三", 20));
        System.out.println(coll); //[123, 456, Tian, Person{name='张三', age=20}]
        System.out.println("---boolean addAll(Collection c) 将指定的Collection中所有元素添加到该集合中---");
        Collection coll01 = new ArrayList();
        coll01.add(789);
        coll01.add(999);
        coll.addAll(coll01);
        System.out.println(coll);//[123, 456, Tian, Person{name='张三', age=20}, 789, 999]
        System.out.println("---boolean remove 删除集合中指定的元素---");
        coll.remove(456);
        System.out.println(coll); //[123, Tian, Person{name='张三', age=20}, 789, 999]
        System.out.println("---boolean isEmpty()判断该集合是否为空---");
        System.out.println(coll.isEmpty()); //false
        System.out.println("---boolean contains:判断集合中是否包含某个元素 false、true---");
        System.out.println(coll.contains(new String("Tian"))); //true
        System.out.println(coll.contains(321)); //false
        System.out.println(coll.contains(new Person("张三", 20))); //false --》true

        System.out.println("---boolean containsAll:判断集合中是否包含指定集合中的所有元素---");
        Collection coll02 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll02));//false 因为前面remove(456)  //在coll中是否包含了coll02的所有元素

        System.out.println("---boolean removeAll(Collection c) 删除指定集合中的所有元素---");
        Collection coll03 = new ArrayList();
        coll03.add(123);
        coll03.add(123);
        coll03.add(123);
//        将集合转为数组--》 toArray()
        Object[] objects = coll03.toArray();
        System.out.println(Arrays.toString(objects));
        coll03.removeAll(coll03);
        System.out.println(coll03);
//        将数组转为集合 asList()
        List<String> list = Arrays.asList("123", "456", "Tom");
        System.out.println(list);

    }
}

class Person {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

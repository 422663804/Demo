package p0712;

import org.junit.Test;

import java.util.*;

public class Demo02 {

    public TreeSet<Person> show(HashSet<Person> hashSet) {
        Set<Person> set = new TreeSet<>(hashSet);
        return new TreeSet<Person>(set);
    }

    @Test
    public void test() {
//        定制排序
//        Comparator<Person> comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Person && o2 instanceof Person) {
//                    Person h1 = (Person) o1;
//                    Person h2 = (Person) o1;
//                    return Integer.compare(h1.getId(), h2.getId());
//                }
//                throw new RuntimeException("异常");
//            }
//        };
        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println("---" + hashSet + "---");
        p1.setName("CC");
        hashSet.remove(p1);
        System.out.println(hashSet);
        hashSet.add(new Person(1001, "CC"));
        System.out.println(hashSet);
        hashSet.add(new Person(1001, "AA"));
        System.out.println("---" + hashSet + "---");

        TreeSet<Person> hashSet2 = show(hashSet);
        Iterator<Person> iter = hashSet2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}

class Person implements Comparable {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
//            比较的是name
            int compare = this.name.compareTo(person.name);
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.id, person.id);
            }
        } else {
            throw new RuntimeException("输入的格式有误");
        }
    }
}
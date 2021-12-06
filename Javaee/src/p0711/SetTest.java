package p0711;

//|----Collection接口：单列集合，用来存储一个一个的对象
//        |---List接口：存储有序的、可重复的数据。可以理解为”动态“数组
//            |---ArrayList ： 作为List接口的主要实现类；线程不安全的，效率高；底层使用Object[]存储
//            |---LinkedList ：对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用的双列表存储
//            |---Vector：作为List接口的古老实现类；线程安全的，效率低
//        |---Set接口：存储无序的、不可重复的数据
//            |---HashSet  作为Set接口的主要实现类；线程不安全的，可以存储null值
//                |---LinkedHashSet  作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历，对于频繁的遍历操作，LinkedHashSet效率高于HashSet
//            |---TreeSet  可以按照添加对象的指定属性进行排序

import org.junit.Test;

import java.util.*;

public class SetTest {
    /*
     因为是无序的，因此没有新的方法，可以使用父类Collection的方法
     一、 Set 存储无序的、不可重复的数据 以HashSet为例
     1、无序性 不等于随机性。存储的数据在底层数组中并非按照索的顺序添加，而是根据数据的哈希值决定的。
     2、不可重复性 保证添加的元素按照equals()判断时，不能返回true 即:相同的元素只能添加一个。

     二、添加元素的过程，以HashSet为例
     我们向HashSet添加元素a，首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，
     此哈希值接着通过某个计算计算出在HashSet底层数组中的存放位置(即为：索引位置)，判断数组此位置上是否已经有元素。
        如果此位置上没有其他元素，则元素a添加成功。 --》情况1
        如果此位置上有其他元素b(或以链表形式存在的多个元素)，则比较元素a与元素b的hash值
           如果hash值不相同，则元素a添加成功。 --》情况2
           如果hash值相同，进而需要调用元素a所在类的equals()方法：
              equals()返回true，元素a添加失败
              equals()返回false，元素a添加成功 --》情况3
      对于添加成的情况2和情况3而言：元素a与已经存在指定索引位置上数据以链表的方式存储
      jdk 7 :元素a放到数组中，指向原来的元素
      jdk 8 :原来的元素在数组中，指向元素a
      总结：七上八下
     */

    @Test
    public void test01() {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(123);
        set.add(new User("Tom", 20));
        set.add(new User("Tom", 20)); //得用equals()和hashCode()方法进行判断
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
    LinkedHashSet的使用
    LinkedHashSet作为HashSet的子类，在添加数据时，每个数据还维护类两个引用，记录此数据前一个数据和数据后一个数据
    优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
     */
    @Test
    public void test02() {
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(123);
        set.add(new User("Tom", 20));
        set.add(new User("Tom", 20)); //得用equals()和hashCode()方法进行判断
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
    1、向TreeSet中添加的数据，要求是相同类的对象
    2、两种排序方式：自然排序(实现Comparable接口)和定制排序(Comparator).
    3、自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals().
    4、定制排序中，比较两个对象是否相同的标准为：compare()放回0，不再是equals().
     */

    @Test
    public void test03() {
        Set set = new TreeSet();
        set.add(new User("Tom", 20));
        set.add(new User("Jack", 18));
        set.add(new User("Jerry", 21));
        set.add(new User("Mike", 22));
        set.add(new User("Jison", 22));
        set.add(new User("Jison", 23));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test04() {
        System.out.println("------定制排序------");
//        按照年龄从小到大排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(), user2.getAge());
                } else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };
        Set set = new TreeSet(comparator);
        set.add(new User("Tom", 20));
        set.add(new User("Jack", 18));
        set.add(new User("Jerry", 21));
        set.add(new User("Mike", 22));
        set.add(new User("Jison", 22));
        set.add(new User("Jison", 23));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class User implements Comparable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User user = (User) o;
//            return this.name.compareTo(user.name);
            int compare = this.name.compareTo(user.name);
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.age, user.age);
            }
        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}

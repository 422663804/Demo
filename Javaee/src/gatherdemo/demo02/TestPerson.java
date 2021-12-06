package gatherdemo.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
在HashSet集合中添加三个Person对象，把姓名相同的人当作同一个人，禁止重复添加。
提示：Person类中定义name和age属性，重写hashCode()方法和equals()方法，针对Person类的name属性进行比较，
如果name相同，hashCode()方法的返回值相同，equals()方法返回true
 */

/**
 * 思路：
 * Set接口数据不可以重复，有序排序
 * 添加数据的有3种方式
 * 1、前面没有其他元素，可以直接添加
 * 2、hash值不同，直接添加
 * 3、hash值相同，但equals不同，可以直接添加
 * 因此把根据姓名进行判断、不需要同时判断姓名还有年龄
 * 重写的hashCode和equals的都改一下。
 */

public class TestPerson {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("张三", 20));
        set.add(new Person("李四", 23));
        set.add(new Person("王五", 22));
        set.add(new Person("张三", 21));
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

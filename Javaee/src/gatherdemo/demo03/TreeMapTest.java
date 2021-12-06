package gatherdemo.demo03;

/*
选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来。
提示：
1）创建TreeMap集合。
2）使用put()方法将学号(“1”、“2”、“3”、“4”、“5”)和姓名(“Lucy”、“John”、“Smith”、“Aimee”、“Amanda”)存储到Map中，存的时候可以打乱顺序观察排序后的效果。
3）使用 map.keySet()获取键的Set集合。
4）使用Set集合的iterator()方法获得Iterator对象用于迭代键。
5）使用Map集合的get()方法获取键所对应的值。
 */

import org.junit.Test;

import java.util.*;

public class TreeMapTest {

    @Test
    public void test() {
        Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        map.put(1, "Luck");
        map.put(3, "John");
        map.put(2, "Smith");
        map.put(4, "Aimee");
        map.put(5, "Tom");

        System.out.println("---方式一:通过keySet()方法---");
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String s = map.get(key); //get(key) 根据key的值进行查找元素
            System.out.println(key + ":" + s);
        }

        //方式2 :通过entrySet方法直接获取
        System.out.println("---方式二: 获取所有的key-value---");
        Set<Map.Entry<Integer, String>> entries = map.entrySet(); //entrySet() 遍历所有的key-value
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

package p0710;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1、jdk 5.0新增的特性
 * 2、在集合中使用泛型
 * 总结
 * 1.集合接口或集合类在jdk5.0时都修改为带泛型的结构
 * 2.在实例化集合类时，可以指明具体的泛型类型
 * 3.指明完以后，在结合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
 * 比如：add(E e) -->实例化后  add(Integer e)
 * 4.注意点：泛型的类型必须是类，不能是基本的数据类型。需要用到基本数据类型的位置拿包装类替换
 * 5.如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型
 */
public class GenericTest {

    //    没有使用泛型
    @Test
    public void test01() {
        ArrayList arrayList = new ArrayList();
//        需求：存放学生的成绩
        arrayList.add(78);
        arrayList.add(88);
        arrayList.add(98);
//        问题1:类型不安全
//        arrayList.add("Tian");
        for (Object score : arrayList) {
//            问题2:强转时，可能出现ClassCastException异常
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }

    //    在集合中使用泛型的情况
    @Test
    public void test02() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(82);
//        list.add("123");  类型不匹配，编译时不通过
        list.add(81);
        list.add(88);
//        方式1
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        方式2
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int stuScore = it.next();
            System.out.println(stuScore);
        }
    }

    //     在集合中使用泛型的情况：以HashMap为例 <键，值>
    @Test
    public void test03() {
//        jdk7.0后新特性：自动识别类型
//        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 89);
        map.put("Tom", 88);
        map.put("Tian", 90);
//        泛型的嵌套
//        entrySet()获取存储在Map中所有映射的Set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "---" + value);
        }
    }
}

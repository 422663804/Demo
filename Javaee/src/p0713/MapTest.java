package p0713;

import org.junit.Test;

import java.util.*;

/*
Map常用方法
增删改查
1、put(key,value) 将数据传入map中  增
2、putAll(Map<? extends K, ? extends V> m); 将另外一组的map值全部复制 增
3、remove(key,value) /remove(key) 将map中的值根据key或者根据key-value来删除指定的值  删
4、replace(key,oldValue,newValue) 将map的值根据key找到再修改值value  改
5、get(key) 根据key的值进行查找  查
6、containsKey(key) 根据key进行查找，判断是否存在这个key
7、containsValue(value) 根据value进行查找，判断是否含有这个value
8、isEmpty() 判断集合是否为空
9、KeySet() 遍历所有key
10、values() 遍历所有的value集
11、entrySet() 遍历所有的key-value
 */
public class MapTest {

    @Test
    public void test01() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "123");
        map.put(2, "456");
        map.put(3, "123");
        map.put(4, "123");
        System.out.println(map.get(3));
        map.replace(3, "123", "321");
        System.out.println(map.get(3));
        map.remove(4);
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("123456"));
        System.out.println(map.isEmpty());
        //遍历所有key；KeySet()
        System.out.println("---获取所有的key---");
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //遍历所有的value集  values()
        System.out.println("---获取所有的value---");
        Collection<String> values = map.values();
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        //遍历所有的key-value
        System.out.println("---获取所有的key-value---");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

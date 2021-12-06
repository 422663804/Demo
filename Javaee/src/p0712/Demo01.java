package p0712;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
练习：在List内去除重复数字值，要求尽量简单
 */
public class Demo01 {

    public List<Integer> remove(List<Integer> list) {
        HashSet<Integer> hashSet = new HashSet<>(list);
        return new ArrayList<Integer>(hashSet);
    }

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);
        List<Integer> list2 = remove(list);
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

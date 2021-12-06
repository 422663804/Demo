package gatherdemo.demo01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 34, 5, 3, 4, 6, 8, 9, 6, 5); //也可以一个个add这里我偷懒用了Collections工具类方法addAll
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

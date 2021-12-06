package p0713;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections工具类常用方法
1、sort(List list) 对集合从小到大排序
2、reverse(List list) 对集合从大到小排序
3、max(List list) 找出集合最大值
4、min(List list) 找出集合最小值
5、shuffle(List list) 随机调换顺序
6、swap(List list,int i,int j)  在集合list中将i和j的元素交换
7、addAll(List list,元素1,元素2,....) 在集合list中添加元素
8、replaceAll(List list, Object oldValue, newValue); 在集合list中，将旧的值替换成新的值
9、binarySearch(List list,Object value) 查找集合list中value元素的坐标
 */

public class CollectionsTest {
    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 123, 46, 789, 455);
        System.out.println("最初的" + list);
        Collections.sort(list);
        System.out.println("Collections.sort(List list)从小到大排序" + list);
        Collections.reverse(list);
        System.out.println("Collections.reverse(List list)从大到小排序" + list);
        System.out.println("Max=" + Collections.max(list));
        System.out.println("Min=" + Collections.min(list));
        Collections.swap(list, 1, 3);
        System.out.println("Collections.swap(list,1,3); 在集合list中将1和3的元素交换" + list);
        Collections.shuffle(list);
        System.out.println("Collections.shuffle(List list)随机排序" + list);
        Collections.replaceAll(list, 455, 555);
        System.out.println("replaceAll(List list, Object oldValue, newValue); 在集合list中，将旧的值替换成新的值" + list);
        int index = Collections.binarySearch(list, 555);
        System.out.println(index);
    }
}

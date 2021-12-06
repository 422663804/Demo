package p0711;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Iterator 又称为迭代器
 * 迭代器的执行原理
 * 内部方法hasNext()和next()
 * hasNext()判断是否还有下一个元素
 * next()指针下移 ，将下移以后集合位置上的元素返回
 */

public class IteratorTest {
    @Test
    public void test01() {
        Collection coll = new ArrayList();
//        Collection coll = new LinkedList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tian"));
        coll.add(new Person("张三", 20));
        Iterator iterator = coll.iterator();
//        方式一：不推荐
//        for (int i = 0;i<coll.size(); i++){
//            System.out.println(iterator.next());
//        }
//        方式二:推荐
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
        }
//        System.out.println(coll);
        Collection cl = new ArrayList();
        System.out.println(cl);
//        错误方式一 NoSuchElementException异常
//        while (iterator.next() != null){
//            System.out.println(iterator.next());
//        }
//        错误方式二 死循环
//        while (coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }
    }

    @Test
    public void test02() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tian"));
        coll.add(new Person("张三", 20));
        Iterator iterator = coll.iterator();
//        将集合中的Tian删除
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("Tian".equals(obj)) {
                iterator.remove();
            }
        }
//        遍历集合
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

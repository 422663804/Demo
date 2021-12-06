package p0712;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

    //    使用自然排序
    @Test
    public void test() {
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("张三", 20, new MyDate(2021, 7, 12));
        Employee e2 = new Employee("李四", 21, new MyDate(2020, 7, 12));
        Employee e3 = new Employee("Jack", 23, new MyDate(2021, 8, 12));
        Employee e4 = new Employee("Tom", 22, new MyDate(2021, 10, 12));
        Employee e5 = new Employee("Marry", 20, new MyDate(2021, 9, 12));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //    使用定制排序
    @Test
    public void test02() {
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate birthday = e1.getBirthday();
                    MyDate birthday1 = e2.getBirthday();
                   return birthday.compareTo(birthday1);
                }
                throw new NullPointerException("传入的数值有误");
            }
        });
        Employee e1 = new Employee("张三", 20, new MyDate(2021, 7, 12));
        Employee e2 = new Employee("李四", 21, new MyDate(2020, 7, 12));
        Employee e3 = new Employee("Jack", 23, new MyDate(2021, 8, 12));
        Employee e4 = new Employee("Tom", 22, new MyDate(2021, 10, 12));
        Employee e5 = new Employee("Marry", 20, new MyDate(2021, 9, 12));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

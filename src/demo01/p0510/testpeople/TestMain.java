package demo01.p0510.testpeople;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Person p1 = new Person("小A", "男", "男");
        Person p2 = new Person("小B","男","华为");
        Person p3 = new Person("小C","男","腾讯");

        Person[] array = new Person[3];
        array[0] = p1;
        array[1] = p2;
        array[2] = p3;
        System.out.println(Arrays.toString(array));
        p1.information();
    }
}

//7. 思考题：结合第上一题，假设某服务器中存储的员工信息正是上述员工类，
//某次从服务器请求得到的内容是一个字符串："[{姓名:小A,性别:男,工作:阿里};{姓名:小B,性别:男,工作:华为};{姓名:小C,性别:男,工作:腾讯}]"，
//这个字符串代表一个员工对象数组，如何解析并实例化这个员工数组？
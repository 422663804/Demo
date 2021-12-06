package demo02.oop623.demo02;

public class TestDate {
    public static void main(String[] args) {
        Date[] date = new Date[]{new Date(2021, 6, 24), new Date(2021, 6, 25), new Date(2021, 6, 26)};
        System.out.println("日期一:" + date[0].hashCode() + " 日期二:" + date[1].hashCode() + " 日期三:" + date[2].hashCode()); //查看hashCode()返回的数据
        if (date[0].equals(date[1]) || date[1].equals(date[2])) {
            System.out.println("存在日期重复");
            if (date[0].hashCode() == date[1].hashCode() || date[1].hashCode() == date[2].hashCode()) {
                System.out.println("日期对象相同");
            } else {
                System.out.println("日期对象不相同");
            }
        } else {
            System.out.println("日期不重复");
        }
    }
}
//2. 写一个Date日期类，有属性：年、月、日，有唯一一个带参构造函数，要求：
//        （一）重写toString()方法、重写equals()方法
//        （二）编写测试类，定义一个日期对象数组，给数组每个元素手动赋值不同的日期实例
//        （三）请使用hashCode()方法证明以上日期数组每个日期对象都不同
//        （四）请利用重写的equals()方法搜索该数组是否有重复的日期，重复日期的含义：两个不同对象表示的日期完全一样
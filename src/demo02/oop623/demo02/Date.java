package demo02.oop623.demo02;

import java.util.Objects;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return getYear() == date.getYear() && getMonth() == date.getMonth() && getDay() == date.getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }
}
//2. 写一个Date日期类，有属性：年、月、日，有唯一一个带参构造函数，要求：
//        （一）重写toString()方法、重写equals()方法
//        （二）编写测试类，定义一个日期对象数组，给数组每个元素手动赋值不同的日期实例
//        （三）请使用hashCode()方法证明以上日期数组每个日期对象都不同
//        （四）请利用重写的equals()方法搜索该数组是否有重复的日期，重复日期的含义：两个不同对象表示的日期完全一样


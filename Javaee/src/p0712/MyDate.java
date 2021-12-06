package p0712;

public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
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
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate) {
            MyDate myDate = (MyDate) o;
            int minusYear = this.getYear() - myDate.getYear();
            if (minusYear != 0) {
                return minusYear;
            }
            int minusMonth = this.getMonth() - myDate.getMonth();
            if (minusMonth != 0) {
                return minusMonth;
            }
            return this.getDay() - myDate.getDay();
        }
        throw new NullPointerException("传入的数值有误");
    }
}
//        MyDate类包含:
//        private成员变量year,month,day;并为每一个属性定义getter, setter方法;

//        创建该类的5个对象，并把这些对象放入TreeSet集合中(下一章:TreeSet需使用泛型来定义)
//        分别按以下两种方式对集合中的元素进行排序，并遍历输出:
//        1).使Employee实现Comparable接口，并按name排序。
//        2).创建TreeSet时传入Comparator对象，按生日日期的先后排序。

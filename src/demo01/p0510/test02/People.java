package demo01.p0510.test02;

public class People {
    public String name;
    public char age;
    public String work;

    public static void main(String[] args) {
        String str = "[{姓名:小A,性别:男,工作:阿里};{姓名:小B,性别:男,工作:华为};{姓名:小C,性别:男,工作:腾讯}]";
        str = str.substring(1,str.length()-1);

    }
}
